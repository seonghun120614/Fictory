package com.fictory.web_backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @NotBlank String phoneNumber,
        @NotBlank @Size(min = 4, max = 20, message = "4 ~ 24자의 아이디 요구")
        String username,
        @NotBlank @Size(min = 8, max = 20, message = "8 ~ 20자의 비밀번호 요구")
        String password
) { }