package com.exercise.kotlingSpring.kotlingSpringDemo.datasource.mock

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.*

internal class MockBankDataSourceTest{

    private val mockDataSource=MockBankDataSource()

    @Test
    fun `should not be empty`(){
        //when
        val banks=mockDataSource.getBanks()

        assertThat(banks).isNotEmpty
    }

}