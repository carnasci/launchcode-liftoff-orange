package com.nationalParkApp.demo.service;

import com.nationalParkApp.demo.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User createUser(User user);

    User getUserById(Long id);

    User updateUser(Long id, User user);
}
