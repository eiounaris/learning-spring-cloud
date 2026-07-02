package com.eiou;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope // 开启配置动态刷新
public class ConfigController {

    @Value("${user.name:unknown}")
    private String userName;

    @Value("${user.age:0}")
    private int userAge;

    private final RestTemplate restTemplate;

    ConfigController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/config/user")
    public String getUserInfo() {
        return "Name: " + userName + ", Age: " + userAge;
    }

    @GetMapping("/call-user")
    public String callUserService() {
        String url = "http://user-service/api/users/1";
        return restTemplate.getForObject(url, String.class);
    }
}