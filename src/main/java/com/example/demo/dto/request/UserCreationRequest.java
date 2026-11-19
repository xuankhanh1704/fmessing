package com.example.demo.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCreationRequest {

    @Size(min = 4,message = "USERNAME_INVALID")
    private String username;
    @Size(min = 8,message = "PASSWORD_INVALID")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private String status;
    private String urlAvt;
    private LocalDate dob;
}
