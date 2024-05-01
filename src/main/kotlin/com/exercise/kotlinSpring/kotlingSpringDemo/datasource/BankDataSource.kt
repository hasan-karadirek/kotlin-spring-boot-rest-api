package com.exercise.kotlingSpring.kotlingSpringDemo.datasource

import com.exercise.kotlinSpring.kotlingSpringDemo.model.Bank


interface BankDataSource{
    fun getBanks():Collection<Bank>
}