package com.micro.user_service.service;

import com.micro.user_service.dto.UserRequestDTO;
import com.micro.user_service.dto.UserResponseDTO;

import java.util.List;
import java.util.UUID;

public interface UserService {
    UserResponseDTO createUser(UserRequestDTO request);

    UserResponseDTO getUserById(UUID id);

    List<UserResponseDTO> getAllUsers();

    void deleteUser(UUID id);
}
