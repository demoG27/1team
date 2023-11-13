package com.example.greenudemy.user.dto;

import com.example.greenudemy.user.entity.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserResponseDto {
    private UUID id;
    private String firstname;
    private String lastname;
    private String middleName;
    private String email;
    private String phoneNumber;
    private String password;
    private UserType userType;
}
