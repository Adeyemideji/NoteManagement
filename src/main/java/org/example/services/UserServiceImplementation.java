package org.example.services;

import org.example.Data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public Long countNumberOfUsers() {
        return userRepository.count();

    }

}

