package com.MeritBankApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountHolderNotFoundException extends Exception {
	
	public AccountHolderNotFoundException(String errorMessage){
		super(errorMessage);
	}

}