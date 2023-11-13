package user.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class User {
    private UUID id;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private String password;
    private LocalDate birthDate;
}
