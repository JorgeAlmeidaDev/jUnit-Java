# Projeto testesjwt

Este projeto é um exemplo de aplicação Spring Boot que demonstra a criação e recuperação de usuários.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

src/main/java/com/jorginho/testesjwt/
├── TestesJwtApplication.java
├── User.java
├── UserController.java
└── UserService.java
src/test/java/com/jorginho/testesjwt/
└── UserIT.java


## Arquivos Principais

### TestesJwtApplication.java

Este é o ponto de entrada da aplicação Spring Boot.

```java
package com.jorginho.testesjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestesJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestesJwtApplication.class, args);
    }

}

Public code references from 5 repositories
User.java

Este arquivo define a classe User como um record, que é uma forma concisa de definir uma classe imutável.

package com.jorginho.testesjwt;

public record User(String nome, String password) {
}

UserController.java

Este controlador expõe um endpoint para criar usuários.

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
    public List<User> create(@RequestBody User user) {
        return userService.create(user);
    }
}

Public code references from 5 repositories
UserService.java

Este serviço contém a lógica de negócios para criar usuários.

package com.jorginho.testesjwt;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> create(List<User> users) {
        // Implementação da lógica de criação de usuários
        return users;
    }
}

Public code references from 5 repositories
Testes
UserIT.java

Este é um teste de integração que verifica a criação e recuperação de usuários.

package com.jorginho.testesjwt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

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

1 vulnerability detected

Public code references from 5 repositories
Como Executar

Para executar o projeto, utilize os seguintes comandos:

mvn clean install
mvn spring-boot:run

A aplicação estará disponível em http://localhost:8080.
Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.
