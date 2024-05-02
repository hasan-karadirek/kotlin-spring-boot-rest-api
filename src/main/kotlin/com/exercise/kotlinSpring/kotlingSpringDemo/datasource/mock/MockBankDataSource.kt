package com.exercise.kotlinSpring.kotlingSpringDemo.datasource.mock

import com.exercise.kotlinSpring.kotlingSpringDemo.datasource.BankDataSource
import com.exercise.kotlinSpring.kotlingSpringDemo.model.Bank
import org.springframework.stereotype.Repository
import org.springframework.context.annotation.Primary

@Repository
@Primary
class MockBankDataSource:BankDataSource{
    val banks=listOf(Bank("123",22.15,1),Bank("1234",22.15,1))
    override fun retrieveBanks():Collection<Bank>{   

        return banks
    }
    override fun retrieveBankByAccountNumber(accountNumber:String):Bank{   
        
        return banks.find { it.accountNumber == accountNumber }
        ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")
    }
}