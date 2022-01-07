package com.example.Spring4.controllers

import com.example.Spring4.services.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
    val helloService: HelloService
) {
    @GetMapping("/hello")
    fun getHello(): String {
        return helloService.getHello()
    }

    @GetMapping("/hello/{id}")
    fun getHelloById(
        @PathVariable id: String
    ): String {
        return helloService.getHelloWithId(id)
    }
}

