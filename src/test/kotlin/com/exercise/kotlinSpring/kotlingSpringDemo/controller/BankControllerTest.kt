package com.exercise.kotlinSpring.kotlingSpringDemo.controller


import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import com.exercise.kotlinSpring.kotlingSpringDemo.service.BankService


@SpringBootTest
@AutoConfigureMockMvc
internal class BankControllerTest{

    @Autowired
    lateinit var mockMvc:MockMvc

    @Test
    fun `GET all banks should return JSON, and status ok!`(){
    mockMvc.get("/api/banks").andDo { print() }.andExpect { status { isOk() } 
    content { contentType(MediaType.APPLICATION_JSON) }
 }
}

@Test
    fun `GET bankByAccountNumber return JSON, and statu ok!`(){
    mockMvc.get("/api/banks/123").andDo { print() }.andExpect { status { isOk() } 
    content { contentType(MediaType.APPLICATION_JSON) }
    jsonPath("$.accountNumber") { value("123") }
 }
}


}