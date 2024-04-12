package com.app.project.bank.service.impl;

import com.app.project.bank.dto.*;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest request);

    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);

    BankResponse transfer(TransferRequest request);

}