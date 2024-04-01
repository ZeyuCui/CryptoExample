package com.gateZ.crypto.service.impl;

import com.gateZ.crypto.entity.Account;
import com.gateZ.crypto.mapper.AccountMapper;
import com.gateZ.crypto.repository.AccountRepository;
import com.gateZ.crypto.service.AccountService;
import dto.AccountDto;

public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
