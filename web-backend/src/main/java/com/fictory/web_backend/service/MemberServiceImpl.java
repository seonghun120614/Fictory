package com.fictory.web_backend.service;

import com.fictory.web_backend.domain.*;
import com.fictory.web_backend.dto.*;
import com.fictory.web_backend.repository.MemberRepository;

import lombok.*;
import org.springframework.stereotype.Service;

import java.time.*;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        Member newMember = new Member(
                registerRequest.username(),
                registerRequest.password(),
                registerRequest.phoneNumber(),
                MemberRole.REGULAR,
                LocalDateTime.now(),
                null,
                null
        );

        Member savedMember = memberRepository.save(newMember);

        RegisterResponse response = new RegisterResponse(
                "token",
                "refreshToken",
                savedMember.getUsername(),
                "Success Register"
        );

        return response;
    }
}
