package com.exercise.kotlingSpring.kotlingSpringDemo.datasource.mock

import com.exercise.kotlingSpring.kotlingSpringDemo.datasource.BankDataSource
import com.exercise.kotlinSpring.kotlingSpringDemo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource:BankDataSource{
    val banks=listOf(Bank("123",22.15,1),Bank("123",22.15,1))
    override fun getBanks():Collection<Bank>{   

        return banks
    }
}