package com.fictory.web_backend.repository;

import com.fictory.web_backend.domain.Member;

public interface MemberRepository {

    Member save(Member member);
    void clear();
}
