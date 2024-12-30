package com.fictory.web_backend.service.impl;

import com.fictory.web_backend.repository.MemberJpaRepository;
import com.fictory.web_backend.service.MemberService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberJpaRepository memberJpaRepository;

}
