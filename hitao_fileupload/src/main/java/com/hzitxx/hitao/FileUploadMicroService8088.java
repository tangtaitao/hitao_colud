package com.hzitxx.hitao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 会员微服务
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FileUploadMicroService8088 {
	public static void main(String[] args) {
		SpringApplication.run(FileUploadMicroService8088.class, args);
	}
}
