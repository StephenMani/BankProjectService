package com.easybank.accountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easybank.accountservice.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {

}
