package com.app.project.bank.service.impl;

import com.app.project.bank.dto.EmailDetails;
import org.springframework.stereotype.Service;

public interface EmailService {
    void sendEmailAlert (EmailDetails emailDetails);

}
