package com.tianyongwei.service;

import com.tianyongwei.entity.core.User;

public interface UserService {

    boolean hasSignupByEmail(String email);

    User signup(String email, String psd1);

    Integer emailVerify(String email, String vcode);

    User signin(String email, String password);

    Integer findpsd(String email);

    boolean psdRestCodeIsValid(String email, String psdresetCode);

    void psdReset(String email, String psd1);
}
