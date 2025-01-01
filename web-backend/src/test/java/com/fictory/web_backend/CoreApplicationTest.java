package com.fictory.web_backend;

import com.fictory.web_backend.controller.*;
import com.fictory.web_backend.repository.*;
import com.fictory.web_backend.service.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.context.*;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CoreApplicationTest {
    @Autowired
    private ApplicationContext ac;

    @DisplayName("Bean 등록 테스트")
    @Test
    public void checkMemberController() {
        assertNotNull(ac.getBean(MemberController.class));
        assertNotNull(ac.getBean(MemberService.class));
        assertNotNull(ac.getBean(MemberRepository.class));
    }
}