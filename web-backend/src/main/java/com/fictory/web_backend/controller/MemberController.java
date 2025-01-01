package com.fictory.web_backend.controller;

import com.fictory.web_backend.domain.*;
import com.fictory.web_backend.dto.*;
import com.fictory.web_backend.service.*;

import lombok.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping(value = "/api/register")
    public RegisterResponse register(@RequestBody RegisterRequest registerRequest) {
        return null;
    }
}