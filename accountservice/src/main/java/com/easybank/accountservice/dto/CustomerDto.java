package com.easybank.accountservice.dto;

import javax.persistence.Column;

import lombok.Data;

@Data
public class CustomerDto {
	private String name;
	private String email;
	private String mobileNumber;

}
