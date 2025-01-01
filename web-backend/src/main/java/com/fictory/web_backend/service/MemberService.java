package com.fictory.web_backend.service;

import com.fictory.web_backend.dto.*;

public interface MemberService {
    RegisterResponse register(RegisterRequest member);
}
