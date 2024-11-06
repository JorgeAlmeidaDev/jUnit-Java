package com.jorginho.testesjwt;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.List;

@Service
public class UserService {
    List<User> users = new ArrayList<>();

    public List<User> create(com.jorginho.testesjwt.User user) {
        if(user.contains(user)) {
            throw new RuntimeException("Usuário já existe");
        }
        users.addAll(user);
        return users;
    }

}
