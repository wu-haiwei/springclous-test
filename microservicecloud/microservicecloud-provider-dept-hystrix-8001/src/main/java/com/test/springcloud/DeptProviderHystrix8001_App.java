package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 自动注册服务
@EnableDiscoveryClient // 发现服务
@EnableCircuitBreaker // 启用熔断器Hystrix的支持
public class DeptProviderHystrix8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix8001_App.class, args);
    }
}
