package com.micro.user_service.controller;


import com.micro.user_service.dto.UserRequestDTO;
import com.micro.user_service.dto.UserResponseDTO;
import com.micro.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserResponseDTO createUser(@RequestBody UserRequestDTO request) {
        return userService.createUser(request);
    }

    @GetMapping("/{id}")
    public UserResponseDTO getUser(@PathVariable UUID id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<UserResponseDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable UUID id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}