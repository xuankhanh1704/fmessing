package com.example.demo.controller;

import com.example.demo.dto.request.UserCreationRequest;
import com.example.demo.dto.request.UserUpdateRequest;
import com.example.demo.dto.response.ApiResponse;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import liquibase.exception.CustomChangeException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users/create")
    ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest request){
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.createUser(request));
        return apiResponse;
    }

    @GetMapping("/users/listUser")
    List<User> getListUser() {
        return userService.getListUsers();
    }

    @GetMapping("/users/{userId}")
    User getUser(@PathVariable("userId") Long userId) {
        return userService.getUserByUserId(userId);
    }

    @PutMapping("/users/{userId}")
    User updateUser(@PathVariable("userId") Long userId, @RequestBody UserUpdateRequest request) {
        return userService.updateUserById(userId, request);
    }

    @DeleteMapping("users/{userId}")
    ResponseEntity<Void> deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUserById(userId);
        return ResponseEntity.noContent().build();
    }
}
