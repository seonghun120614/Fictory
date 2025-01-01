package com.fictory.web_backend.dto;

public record RegisterRequest(
        String phoneNumber,
        String username,
        String password
) { }
