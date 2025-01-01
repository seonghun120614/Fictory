package com.fictory.web_backend.repository;


import com.fictory.web_backend.domain.*;
import org.springframework.stereotype.*;

import java.util.concurrent.*;

@Repository
public class MemoryMemberRepository implements MemberRepository {

    private static ConcurrentMap<Long, Member> members = new ConcurrentHashMap<>();

    @Override
    public Member save(Member member) {
        return null;
    }
}
