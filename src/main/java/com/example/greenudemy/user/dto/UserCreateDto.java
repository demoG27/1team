package com.example.greenudemy.user.dto;

import com.example.greenudemy.user.entity.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCreateDto {
    private String firstname;
    private String lastname;
    private String middleName;
    private String email;
    private String phoneNumber;
    private String password;
}
