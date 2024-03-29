package com.easybank.accountservice.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easybank.accountservice.constants.AccountConstants;
import com.easybank.accountservice.dto.CustomerDto;
import com.easybank.accountservice.entity.Accounts;
import com.easybank.accountservice.entity.Customer;
import com.easybank.accountservice.exception.CustomerAlreadyExistsException;
import com.easybank.accountservice.mapper.CustomerMapper;
import com.easybank.accountservice.repository.AccountRepository;
import com.easybank.accountservice.repository.CustomerRepository;
import com.easybank.accountservice.service.IAccountService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceImplementation implements IAccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void createAccount(CustomerDto customerDto) {
		Customer customer=CustomerMapper.mapToCustomer(customerDto, new Customer());
		Optional<Customer> optionalCustomer= customerRepository.findByMobileNumber(customerDto.getMobileNumber());
		//		System.out.println(optionalCustomer);
		if(optionalCustomer.isPresent()) {
			throw new CustomerAlreadyExistsException("Customer already registered with given mobile number"+customerDto.getMobileNumber());
		}
		customer.setMobileNumber("234567");
		customer.setCreatedAt(LocalDateTime.now());
		customer.setCreatedBy("Anonymous");
		Customer savedCustomer= customerRepository.save(customer);
		savedCustomer.setCustomerId(customer.getCustomerId());
		accountRepository.save(createNewAccount(savedCustomer));
		
	}
	private Accounts createNewAccount(Customer customer) {
		Accounts newAccount=new Accounts();
		newAccount.setCustomerId(customer.getCustomerId());
		long randomAccountNumber=1000000000L+new Random().nextInt(900000000);
		newAccount.setAccountNumber(randomAccountNumber);
		newAccount.setAccountType(AccountConstants.SAVINGS);
		newAccount.setBranchAddress(AccountConstants.ADDRESS);
		newAccount.setCreatedAt(LocalDateTime.now());
		newAccount.setCreatedBy("Anonymous");
		return newAccount;
	}
}
