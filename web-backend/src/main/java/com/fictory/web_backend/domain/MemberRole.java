package com.fictory.web_backend.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MemberRole {
    ADMIN(0),
    REGULAR(1);

    private final int level;

}
