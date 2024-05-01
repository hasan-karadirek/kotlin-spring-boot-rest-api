package com.exercise.kotlinSpring.kotlingSpringDemo.service

import com.exercise.kotlinSpring.kotlingSpringDemo.datasource.BankDataSource
import org.junit.jupiter.api.Test
import io.mockk.verify
import io.mockk.*

internal class BankServiceTest{

private val dataSource:BankDataSource = mockk(relaxed=true);
private val bankService = BankService(dataSource);

@Test
fun `should banks size greater than 1`(){
    bankService.getBanks()
    verify(exactly = 1) { dataSource.retrieveBanks() }

}

}