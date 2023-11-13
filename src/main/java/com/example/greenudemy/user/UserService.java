package com.example.greenudemy.user;

import com.example.greenudemy.user.dto.UserCreateDto;
import com.example.greenudemy.user.dto.UserResponseDto;
import com.example.greenudemy.user.entity.User;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final ModelMapper modelMapper = new ModelMapper();
    private final UserRepository userRepository;

    public UserResponseDto createUser(UserCreateDto userCreateDto) {
        User user = new User(UUID.randomUUID(),
                userCreateDto.getFirstname(),
                userCreateDto.getLastname(),
                userCreateDto.getMiddleName(),
                userCreateDto.getEmail(),
                userCreateDto.getPhoneNumber(),
                userCreateDto.getPassword(),
                null);

        userRepository.save(user);
        return modelMapper.map(user, UserResponseDto.class);
    }

    @Transactional
    public UserResponseDto updateUser(UUID id, UserCreateDto userCreateDto) {
        User user = userRepository.findById(id).get();
        user.setFirstname(userCreateDto.getFirstname());
        user.setLastname(userCreateDto.getLastname());
        user.setMiddleName(userCreateDto.getMiddleName());
        user.setEmail(userCreateDto.getEmail());
        user.setPassword(userCreateDto.getPassword());
        user.setPhoneNumber(userCreateDto.getPhoneNumber());

        return modelMapper.map(user, UserResponseDto.class);
    }

    public List<UserResponseDto> getAllUser() {
        List<User> all = userRepository.findAll();
        return all.stream()
                .map(user -> modelMapper.map(user, UserResponseDto.class))
                .toList();
    }

    public UserResponseDto deleteUser(UUID id) {
        User user = userRepository.findById(id).get();
        userRepository.deleteById(id);
        return modelMapper.map(user, UserResponseDto.class);
    }

}
