package com.example.Spring4.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestConsumerController {

    @GetMapping("/rest")
    fun get(): String {
        return ""
    }

}