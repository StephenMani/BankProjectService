package com.easybank.accountservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class ResponseDto {
	
	private String statusCode;
	private String statusMsg;

}
