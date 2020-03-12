package com.bbg.xxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrix
@EnableAsync
@SpringBootApplication
@MapperScan(basePackages = {"com.bbg.**.dao"})
public class XxxApplication {

	public static void main(String[] args) {
		SpringApplication.run(XxxApplication.class, args);
		System.out.println("====================采购计划启动成功===========================");
	}
}
