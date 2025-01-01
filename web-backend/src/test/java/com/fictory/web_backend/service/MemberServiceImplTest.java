package com.fictory.web_backend.service;

import com.fictory.web_backend.dto.*;
import com.fictory.web_backend.repository.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MemberServiceImplTest {

    @InjectMocks
    private MemberServiceImpl memberService;

    @Mock
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