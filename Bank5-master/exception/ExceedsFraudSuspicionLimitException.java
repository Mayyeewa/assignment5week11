package com.MeritBankApp.exception;

public class ExceedsFraudSuspicionLimitException extends Exception {
    public ExceedsFraudSuspicionLimitException(String message) { super(message); }
}