package com.exercise.kotlinSpring.kotlingSpringDemo.controller


import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.mock.mockito.MockBean
import com.exercise.kotlinSpring.kotlingSpringDemo.service.BankService


@SpringBootTest
@AutoConfigureMockMvc
internal class BankControllerTest{

    @Autowired
    lateinit var mockMvc:MockMvc
    @MockBean
    lateinit var bankService: BankService
    @Test
    fun `shoiulds`(){
    mockMvc.get("/api/banks").andDo { print() }.andExpect { status { isOk() } }
}


}