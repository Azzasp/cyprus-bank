package com.cyprus.banking.backend.security.requests;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LoginRequest {

    private final String email;
    private final String password;

}
