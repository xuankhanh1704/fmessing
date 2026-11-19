package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_EXISTED(1001,"User already existed"),
    PASSWORD_INCORRECT(1002,"Password incorrect"),
    USERNAME_INVALID(1003,"Username must be at least 4 characters"),
    PASSWORD_INVALID(1004,"Password must be at least 8 characters"),
    UNCATEGORIZED(9000,"Uncategorized"),
    INVALID_KEY(4004,"Invalid Message Key"),
    ;
    private int code;
    private String message;
}
