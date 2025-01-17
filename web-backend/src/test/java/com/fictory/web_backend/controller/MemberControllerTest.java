package com.fictory.web_backend.controller;


import com.fasterxml.jackson.databind.*;
import com.fictory.web_backend.controller.*;
import com.fictory.web_backend.dto.*;
import com.fictory.web_backend.service.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;
import org.springframework.http.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.*;
import org.springframework.test.web.servlet.setup.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class MemberControllerTest {

    @InjectMocks
    private MemberController memberController;

    @Mock
    private MemberService memberService;

    // HTTP 생성을 위한 MockMvc 선언
    private MockMvc mockMvc;

    @BeforeEach
    public void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(memberController).build();
    }

    @DisplayName("회원가입 컨트롤러 테스트")
    @Test
    public void registerControllerTest() throws Exception {
        // given
        RegisterRequest request = new RegisterRequest(
                "010-0000-0000",
                "khwkhw",
                "12341234"
        );

        RegisterResponse response = new RegisterResponse(
                "token",
                "refreshToken",
                "khwkhw",
                "Register Successful"
        );

        doReturn(response).when(memberService)
                .register(any(RegisterRequest.class));

        // when
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonRequest = objectMapper.writeValueAsString(request);

        ResultActions result = mockMvc.perform(
                MockMvcRequestBuilders.post("/api/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonRequest));

        // then
        result.andExpect(status().isOk())
                .andExpect(jsonPath("$.token").value(response.token()))
                .andExpect(jsonPath("$.refreshToken").value(response.refreshToken()))
                .andExpect(jsonPath("$.username").value(response.username()));
    }
}