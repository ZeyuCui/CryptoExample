package com.gateZ.crypto.repository;

import com.gateZ.crypto.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    
}
