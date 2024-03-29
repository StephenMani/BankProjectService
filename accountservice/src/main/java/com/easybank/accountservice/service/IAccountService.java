package com.easybank.accountservice.service;

import com.easybank.accountservice.dto.CustomerDto;

public interface IAccountService {
	
	
	void createAccount(CustomerDto customerDto);
}
