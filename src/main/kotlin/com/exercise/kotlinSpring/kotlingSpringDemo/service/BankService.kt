package com.exercise.kotlinSpring.kotlingSpringDemo.service

import org.springframework.stereotype.Service
import com.exercise.kotlinSpring.kotlingSpringDemo.model.Bank
import com.exercise.kotlinSpring.kotlingSpringDemo.datasource.BankDataSource

@Service
class BankService(private val dataSource:BankDataSource){

    fun getBanks():Collection<Bank> { return dataSource.retrieveBanks()}
    fun getBankByAccountNumber(accountNumber: String):Bank { return dataSource.retrieveBankByAccountNumber(accountNumber) }
}