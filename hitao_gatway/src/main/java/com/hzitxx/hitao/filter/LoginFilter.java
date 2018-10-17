package com.hzitxx.hitao.filter;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.interfaces.Claim;
import com.hzitxx.hitao.utils.JwtTokenUtil;
import com.hzitxx.hitao.utils.ServerResponse;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 登录拦截
 * 
 * @author Administrator
 *
 */
@Configuration
public class LoginFilter extends ZuulFilter {

	/**
	 * 是否过滤
	 */
	@Override
	public boolean shouldFilter() {
		// 获取上下文对象
		RequestContext currentContext = RequestContext.getCurrentContext();
		// 获取request对象
		HttpServletRequest request = currentContext.getRequest();
		// 获取访问路径
		String uri = request.getRequestURI();
		// 判断是不是登录路径
		if (uri.contains("/login")) {
			// 是登录路径，不拦截
			return false;
		}
		// 不是登录路径。进行拦截
		return true;
	}

	/**
	 * 过滤的逻辑处理
	 */
	@Override
	public Object run() {
		// 获取上下文对象
		RequestContext currentContext = RequestContext.getCurrentContext();
		// 获取request对象
		HttpServletRequest request = currentContext.getRequest();
		// 获取response对象
		HttpServletResponse response = currentContext.getResponse();
		// 设置返回信息的格式
		response.setContentType("application/json;charset=utf-8");
		// 获取token值
		String token = request.getParameter("token");
		// 判断token是否为空
		if (StringUtils.isEmpty(token)) {
			// 为空则拦截请求
			currentContext.setSendZuulResponse(false);
			// 返回错误信息
			ServerResponse<Object> serverResponse = ServerResponse.createByErrorMessage("用户信息获取失败");
			currentContext.setResponseBody(JSON.toJSONString(serverResponse));
		} else {
			// 不为空则进行token解析
			Map<String, Claim> map = null;
			try {
				map = JwtTokenUtil.parseToken(token);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			// 判断token是否解析正确
			if (map != null) {
				// token正确
				// 放行
			} else {
				// token错误
				// 拦截请求
				currentContext.setSendZuulResponse(false);
				// 返回错误信息
				ServerResponse<Object> serverResponse = ServerResponse.createByErrorMessage("用户信息获取失败");
				currentContext.setResponseBody(JSON.toJSONString(serverResponse));
			}
		}
		return null;
	}

	/**
	 * 过滤类型
	 */
	@Override
	public String filterType() {
		return FilterType.PRE;
	}

	/**
	 * 优先级
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

}
