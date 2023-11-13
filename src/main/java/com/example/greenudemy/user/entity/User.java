package com.example.greenudemy.user.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "`user`")
public class User {
    @Id
    private UUID id;
    private String firstname;
    private String lastname;
    private String middleName;
    private String email;
    private String phoneNumber;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserType userType;
}
