package com.exercise.kotlingSpring.kotlingSpringDemo.service

import com.exercise.kotlingSpring.kotlingSpringDemo.datasource.BankDataSource

import org.junit.jupiter.api.Test


import io.mockk.verify
import io.mockk.mockk

internal class BankServiceTest{

private val dataSource:BankDataSource = mockk(relaxed=true);
private val bankService = BankService(dataSource);

@Test
fun `should`(){
    bankService.getBanks();
    verify(exactly = 2) { dataSource.retrieveBanks() }

}

}