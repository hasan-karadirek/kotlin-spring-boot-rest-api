package com.exercise.kotlinSpring.kotlingSpringDemo.service

import org.springframework.stereotype.Service
import com.exercise.kotlinSpring.kotlingSpringDemo.model.Bank
import com.exercise.kotlinSpring.kotlingSpringDemo.datasource.BankDataSource
import org.springframework.context.annotation.Primary;

@Service
class BankService(private val dataSource:BankDataSource){

    fun getBanks():Collection<Bank> = dataSource.retrieveBanks()
}