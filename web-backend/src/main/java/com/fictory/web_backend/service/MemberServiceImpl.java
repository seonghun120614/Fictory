package com.fictory.web_backend.service;

import com.fictory.web_backend.domain.*;
import com.fictory.web_backend.dto.*;
import com.fictory.web_backend.repository.MemberRepository;

import lombok.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        return null;
    }
}
