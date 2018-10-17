package com.hzitxx.hitao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关微服务
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GatwayMicroService8081 {
	public static void main(String[] args) {
		SpringApplication.run(GatwayMicroService8081.class, args);
	}
}
