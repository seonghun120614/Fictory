package com.fictory.web_backend.repository;

import com.fictory.web_backend.domain.*;
import org.junit.jupiter.api.*;

import java.time.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository memoryMemberRepository = new MemoryMemberRepository();

    static Member member1;
    static Member member2;

    @BeforeAll
    static void setup() {
        member1 = new Member(
                "username1",
                "password1",
                "010-0000-0000",
                MemberRole.REGULAR,
                LocalDateTime.now(),
                null,
                null
        );
        member2 = new Member(
                "username1",
                "password2",
                "010-1111-1111",
                MemberRole.REGULAR,
                LocalDateTime.now(),
                null,
                null
        );
    }

    @BeforeEach
    void init() {
        memoryMemberRepository.clear();
    }

    @DisplayName("회원 저장 테스트")
    @Test
    void memberSaveTest() {
        Member expectedResult = memoryMemberRepository.save(member1);
        assertEquals(expectedResult, member1);
    }

    @DisplayName("중복 회원 저장 테스트")
    @Test
    void duplicatedMemberTest() {
        memoryMemberRepository.save(member1);
        Member expectedResult = memoryMemberRepository.save(member2);
        assertNull(expectedResult);
    }
}