package com.exercise.kotlingSpring.kotlingSpringDemo.service

import org.springframework.stereotype.Service
import com.exercise.kotlinSpring.kotlingSpringDemo.model.Bank
import com.exercise.kotlingSpring.kotlingSpringDemo.datasource.BankDataSource

@Service
class BankService(private val dataSource:BankDataSource){

    fun getBanks():Collection<Bank>{ return dataSource.retrieveBanks()}
}