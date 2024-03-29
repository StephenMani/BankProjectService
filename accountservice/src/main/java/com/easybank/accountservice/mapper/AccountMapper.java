package com.easybank.accountservice.mapper;

import com.easybank.accountservice.dto.AccountsDto;
import com.easybank.accountservice.entity.Accounts;

public class AccountMapper {
	
	public static AccountsDto mapToAccountDto(Accounts accounts,AccountsDto accountsDto) {
		
		accountsDto.setAccountNumber(accounts.getAccountNumber());
		accountsDto.setAccountType(accounts.getAccountType());
		accountsDto.setBranchAddress(accounts.getBranchAddress());
		return accountsDto;
		
	}
	public static Accounts mapToAccounts(AccountsDto accountsDto,Accounts accounts) {
		accounts.setAccountNumber(accountsDto.getAccountNumber());
		accounts.setAccountType(accountsDto.getAccountType());
		accounts.setBranchAddress(accountsDto.getBranchAddress());
		return accounts;
	}

}
