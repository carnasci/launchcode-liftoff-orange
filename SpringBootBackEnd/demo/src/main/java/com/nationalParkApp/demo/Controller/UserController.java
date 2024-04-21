package com.nationalParkApp.demo.Controller;

import com.nationalParkApp.demo.Model.User;
import com.nationalParkApp.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) { this.userService = userService; }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) { return userService.createUser(user); }

    @GetMapping(path = "/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = null;
        user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @PutMapping(path = "/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        user = userService.updateUser(id, user);
        return ResponseEntity.ok(user);
    }

}