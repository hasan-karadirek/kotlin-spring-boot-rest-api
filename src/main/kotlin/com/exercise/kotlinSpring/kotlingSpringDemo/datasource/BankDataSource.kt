package com.exercise.kotlinSpring.kotlingSpringDemo.datasource

import com.exercise.kotlinSpring.kotlingSpringDemo.model.Bank


interface BankDataSource{
    fun retrieveBanks():Collection<Bank>;
    fun retrieveBankByAccountNumber(accountNumber:String):Bank;
}