package com.exercise.kotlinSpring.kotlingSpringDemo.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import com.exercise.kotlinSpring.kotlingSpringDemo.model.Bank
import com.exercise.kotlinSpring.kotlingSpringDemo.service.BankService

@RestController
@RequestMapping("/api/banks")
class BankController(private val service:BankService){

    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()
    
    @GetMapping("/{accountNumber}")
    fun getBankByAccountNumber(@PathVariable accountNumber:String): Bank = service.getBankByAccountNumber(accountNumber)
}