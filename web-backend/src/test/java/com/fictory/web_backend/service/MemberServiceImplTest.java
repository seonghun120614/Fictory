package com.fictory.web_backend.service;

import com.fictory.web_backend.dto.*;
import com.fictory.web_backend.repository.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class MemberServiceImplTest {
    @Autowired
    MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;

    @DisplayName("회원가입 서비스 테스트")
    @Test
    public void registerServiceTest() {
        // given
        RegisterRequest request = new RegisterRequest(
                "010-0000-0000",
                "khw",
                "12341234"
        );

        RegisterResponse expectedResponse = new RegisterResponse(
                "token",
                "refreshToken",
                "khw",
                "Success Register"
        );

        // when
        RegisterResponse actualResponse = memberService.register(request);

        // then
        assertNotNull(actualResponse);
        assertEquals(expectedResponse.username(), actualResponse.username());
    }
}