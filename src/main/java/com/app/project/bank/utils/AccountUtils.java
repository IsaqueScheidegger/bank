package com.app.project.bank.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";

    public static final String ACCOUNT_EXISTS_MESSAGE = "THIS USER ALREADY HAS AN ACCOUNT CREATED!";

    public static final String ACCOUNT_CREATION_SUCCESS = "002";

    public static final String ACCOUNT_CREATION_MESSAGE = "ACCOUNT HAS BEEN SUCCESSFULLY CREATED!";

    public static final String ACCOUNT_NOT_EXISTS_CODE = "003";

    public static final String ACCOUNT_NOT_EXISTS_MESSAGE = "USER WITH THE PROVIDED NUMBER DOESN'T EXIST...";

    public static final String ACCOUNT_FOUND_CODE = "004";

    public static final String ACCOUNT_FOUND_SUCCESS = "USER ACCOUNT FOUND...";

    public static final String ACCOUNT_CREDITED_SUCCESS = "005";

    public static final String ACCOUNT_CREDIT_SUCCESS_MESSAGE = "USER ACCOUNT WAS CREDITED SUCCESSFULLY! ";

    public static final String INSUFFICIENT_BALANCE_CODE = "006";

    public static final String INSUFFICIENT_BALANCE_MESSAGE = "INSUFFICIENT BALANCE...";

    public static final String ACCOUNT_DEBITED_SUCCESS = "007";

    public static final String ACCOUNT_DEBITED_MESSAGE = "ACCOUNT HAS BEEN SUCCESSFULLY DEBITED!";

    public static final String TRANSFER_SUCCESSFUL_CODE = "008";

    public static final String TRANSFER_SUCCESSFUL_MESSAGE = "TRANSFER SUCCESSFUL";


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
