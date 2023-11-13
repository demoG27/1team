package com.example.greenudemy.user;

import com.example.greenudemy.user.dto.UserCreateDto;
import com.example.greenudemy.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public UserResponseDto createUser(@RequestBody UserCreateDto userCreateDto) {
        return userService.createUser(userCreateDto);
    }

    @GetMapping
    public List<UserResponseDto> getAllUser(){
        return userService.getAllUser();
    }
    @PostMapping("/{id}")
    public UserResponseDto updateUser(@PathVariable("id") UUID id, @RequestBody UserCreateDto userCreateDto){
        return userService.updateUser(id, userCreateDto);
    }
    @DeleteMapping("/{id}")
    public UserResponseDto deleteUser(@PathVariable("id")UUID id){
        return userService.deleteUser(id);
    }
}
