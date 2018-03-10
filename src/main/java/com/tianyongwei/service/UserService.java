package com.tianyongwei.service;

import com.tianyongwei.entity.core.User;

public interface UserService {

    boolean hasSignupByEmail(String email);

    User signup(String email, String psd1);
}
