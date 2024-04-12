package com.app.project.bank.service.impl;

import com.app.project.bank.dto.TransactionDto;
import com.app.project.bank.entity.Transaction;
import com.app.project.bank.repository.TransactionRepository;
import jakarta.xml.bind.SchemaOutputResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionServiceImpl implements TransactionService{


    @Autowired
    TransactionRepository transactionRepository;
    
    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");
    }
}
