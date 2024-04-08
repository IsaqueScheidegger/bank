package com.app.project.bank.service.impl;

import com.app.project.bank.dto.BankResponse;
import com.app.project.bank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

}
