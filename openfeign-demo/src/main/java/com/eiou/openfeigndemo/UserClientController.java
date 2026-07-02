package com.eiou.openfeigndemo;

import com.eiou.common.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserClientController {

    private final UserClient userClient;

    @GetMapping("/feign/users/{id}")
    public User callUserService(@PathVariable("id") Long id) {
        return userClient.getUserById(id);
    }

}
