package com.app.project.bank.controller;

import com.app.project.bank.dto.*;
import com.app.project.bank.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/create")
    public String showCreateUserPage(Model model) {
        model.addAttribute("userRequest", new UserRequest());
        return "create_user";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute UserRequest userRequest, Model model) {
        BankResponse response = userService.createAccount(userRequest);
        model.addAttribute("response", response);
        return "create_user_result";
    }

    @GetMapping("/transfer")
    public String showTransferPage(Model model) {
        model.addAttribute("transferRequest", new TransferRequest());
        return "transfer";
    }

    @PostMapping("/transfer")
    public String transfer(@ModelAttribute TransferRequest transferRequest, Model model) {
        BankResponse response = userService.transfer(transferRequest);
        model.addAttribute("response", response);
        return "transfer_result";
    }

    @GetMapping("/balanceEnquiry")
    public String showBalanceEnquiryPage(Model model) {
        model.addAttribute("enquiryRequest", new EnquiryRequest());
        return "balance_enquiry";
    }

    @PostMapping("/balanceEnquiry")
    public String balanceEnquiry(@ModelAttribute EnquiryRequest enquiryRequest, Model model) {
        BankResponse response = userService.balanceEnquiry(enquiryRequest);
        model.addAttribute("response", response);
        return "balance_enquiry_result";
    }
}
