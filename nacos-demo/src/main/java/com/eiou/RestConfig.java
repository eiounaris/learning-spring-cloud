package com.eiou;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    @Bean
    @LoadBalanced   // 让 RestTemplate 具备服务名解析能力
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
