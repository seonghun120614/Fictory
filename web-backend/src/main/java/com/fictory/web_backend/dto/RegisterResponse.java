package com.fictory.web_backend.dto;

public record RegisterResponse(
        String token,
        String refreshToken,
        String username,
        String message
) { }