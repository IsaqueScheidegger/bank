package com.app.project.bank.service.impl;

import com.app.project.bank.dto.BankResponse;
import com.app.project.bank.dto.CreditDebitRequest;
import com.app.project.bank.dto.EnquiryRequest;
import com.app.project.bank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest request);

    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}