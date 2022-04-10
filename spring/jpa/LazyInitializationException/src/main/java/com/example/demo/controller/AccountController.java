package com.example.demo.controller;

import com.example.demo.db.model.Account;
import com.example.demo.db.model.Transaction;
import com.example.demo.db.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("accounts")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping(path = "/{accountId}/first-transaction", produces = "application/json")
    public Transaction getFirstTransactionByAccount(@PathVariable String accountId, String amount) {
        Optional<Account> optionalAccount = accountRepository.findById(accountId);

        Account account = null;
        Transaction transaction = null;
        if(optionalAccount.isPresent()){
            account = optionalAccount.get();
            transaction = account.transactionList.get(0);

        }
        return transaction;
    }
}
