package com.MeritBankApp.exception;

public class ExceedsAvailableBalanceException extends Exception {
    public ExceedsAvailableBalanceException(String message) { super(message); }
}