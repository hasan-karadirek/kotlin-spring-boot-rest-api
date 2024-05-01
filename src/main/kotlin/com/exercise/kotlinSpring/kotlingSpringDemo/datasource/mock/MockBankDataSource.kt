package com.exercise.kotlingSpring.kotlingSpringDemo.datasource.mock

import com.exercise.kotlingSpring.kotlingSpringDemo.datasource.BankDataSource
import com.exercise.kotlinSpring.kotlingSpringDemo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource:BankDataSource{
    override fun getBanks():Collection<Bank>{
        return listOf(Bank("123",22.20,1),Bank("1232",22.20,1))
    }
}