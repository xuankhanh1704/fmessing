package com.example.demo.dto.request;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserUpdateRequest {
    private String password;
    private String firstName;
    private String lastName;
    private String status;
    private String urlAvt;
    private LocalDate dob;
}
