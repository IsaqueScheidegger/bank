package com.app.project.bank.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";

    public static final String ACCOUNT_EXISTS_MESSAGE = "ESTE USUÁRIO JÁ POSSUI UMA CONTA CRIADA!";

    public static final String ACCOUNT_CREATION_SUCCESS = "002";

    public static final String ACCOUNT_CREATION_MESSAGE = "CONTA CRIADA COM SUCESSO!";

    public static final String ACCOUNT_NOT_EXISTS_CODE = "003";

    public static final String ACCOUNT_NOT_EXISTS_MESSAGE = "USUÁRIO COM O NÚMERO FORNECIDO NÃO EXISTE...";

    public static final String ACCOUNT_FOUND_CODE = "004";

    public static final String ACCOUNT_FOUND_SUCCESS = "CONTA DE USUÁRIO ENCONTRADA...";

    public static final String ACCOUNT_CREDITED_SUCCESS = "005";

    public static final String ACCOUNT_CREDIT_SUCCESS_MESSAGE = "CONTA DO USUÁRIO CREDITADA COM SUCESSO! ";

    public static final String INSUFFICIENT_BALANCE_CODE = "006";

    public static final String INSUFFICIENT_BALANCE_MESSAGE = "SALDO INSUFICIENTE...";

    public static final String ACCOUNT_DEBITED_SUCCESS = "007";

    public static final String ACCOUNT_DEBITED_MESSAGE = "CONTA DEBITADA COM SUCESSO!";

    public static final String TRANSFER_SUCCESSFUL_CODE = "008";

    public static final String TRANSFER_SUCCESSFUL_MESSAGE = "TRANSFERÊNCIA REALIZADA COM SUCESSO";


    public static String generateAccountNumber(){
        /**
         * 2024 + randomSixDigits
         *
         * 2023112233
         */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        // generate a random number between min and max:

        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        //convert the current and randomNumber to string, then concatenate them
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();
    }
}
