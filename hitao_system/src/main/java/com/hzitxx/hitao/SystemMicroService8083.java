package com.hzitxx.hitao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 系统微服务
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.hzitxx.hitao.mapper")
public class SystemMicroService8083 {
	public static void main(String[] args) {
		SpringApplication.run(SystemMicroService8083.class, args);
	}
}
