package com.jorginho.testesjwt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.client.RestTemplate;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserIT {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getUsers() {
        User[] users = restTemplate.getForObject("http://localhost:8080/users", User[].class);

}

    @Test
    public void createUser() {
        User user = new User("jorginho", "123");

       User[] users = new User[]{restTemplate.postForObject("http://localhost:8080/users", user, User.class)};

    }
}
