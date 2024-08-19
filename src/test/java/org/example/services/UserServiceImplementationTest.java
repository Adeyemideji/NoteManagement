package org.example.services;

import org.example.dto.request.CreateUserRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceImplementationTest {
    @Autowired
    private UserService userService;

    @Test
    public void testUserCanBeCreated(){
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUsername("username");
        createUserRequest.setEmail("Email");
        createUserRequest.setPassword("password");



    }

}