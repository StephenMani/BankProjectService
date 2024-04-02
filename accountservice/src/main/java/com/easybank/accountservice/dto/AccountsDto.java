package com.easybank.accountservice.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data@AllArgsConstructor@Getter@Setter
public class AccountsDto {

	public AccountsDto() {
		// TODO Auto-generated constructor stub
	}

	private long accountNumber;
	
	private String accountType;
	
	private String branchAddress;
}
