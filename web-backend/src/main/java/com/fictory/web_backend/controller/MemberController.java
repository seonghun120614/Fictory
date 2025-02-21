package com.fictory.web_backend.controller;

import com.fictory.web_backend.dto.*;
import com.fictory.web_backend.service.MemberService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/register")
public class MemberController {
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity<RegisterResponse> register(
            @Valid @RequestBody RegisterRequest requestDto
    ) {
        RegisterResponse responseDto = memberService.register(requestDto);

        return ResponseEntity.ok(responseDto);
    }
}
