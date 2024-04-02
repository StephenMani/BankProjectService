package com.easybank.accountservice.dto;

import javax.persistence.Column;

import com.easybank.accountservice.entity.Accounts;

import lombok.Data;

@Data
public class CustomerDto {
	private String name;
	private String email;
	private String mobileNumber;
	private AccountsDto accountsDto;
}
