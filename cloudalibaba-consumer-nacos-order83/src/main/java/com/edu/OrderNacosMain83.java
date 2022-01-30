package com.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * OrderNacosMain83
 * @CreateTime: 2020-03-28
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83{
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain83.class,args);
    }
}