package com.jorginho.testesjwt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
        @Autowired
        private UserService userService;
        @RequestMapping("/users")
        public List<org.apache.catalina.User> create(@RequestBody User user) {
            return userService.create(user);
        }


}
