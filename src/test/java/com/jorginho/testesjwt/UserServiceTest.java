package com.jorginho.testesjwt;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {
    private UserService userService = new UserService();

    // Teste de criação de usuário
    @Test
    public void createUser() {
        // AAA
        // Arrange
        User user = (new User("jorginho", "123"));
        // Act
        List<org.apache.catalina.User> users = userService.create(user);

        // Assert
        assertEquals(1, users.size());
        assertEquals("jorginho", users.get(0));
        assertEquals("123", users.get(0));
    }

    @Test
    public void createUser_ThrowsException() {
        // AAA
        // Arrange
        User user = new User ("jorginho", "123");
        // Act
        List<org.apache.catalina.User> users = userService.create(user);

        // Assert
        assertEquals(1, users.size());
        assertEquals("jorginho", users.get(0));
        assertEquals("123", users.get(0));
    }
}