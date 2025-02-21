package com.fictory.web_backend.repository;


import com.fictory.web_backend.domain.*;
import org.springframework.stereotype.*;

import java.util.concurrent.*;

@Repository
public class MemoryMemberRepository implements MemberRepository {
    private final static ConcurrentMap<Integer, Member> MEMBERS = new ConcurrentHashMap<>();

    @Override
    public Member save(Member member) {
        // Blank
        if (MEMBERS.isEmpty()) {
            MEMBERS.put(0, member);
            System.out.println("HELLO");
            return member;
        }

        for (int key : MEMBERS.keySet()) {
            System.out.println("key: " + key);

            // Existed
            if (MEMBERS.get(key).getUsername().equals(member.getUsername()))
                return null;
        }

        // Missing
        MEMBERS.put(MEMBERS.size(), member);
        return member;
    }

    @Override
    public void clear() {
        MEMBERS.clear();
    }
}
