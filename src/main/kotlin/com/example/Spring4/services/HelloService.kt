package com.example.Spring4.services

import com.example.Spring4.repositorys.HelloRepository
import org.springframework.stereotype.Service

@Service
class HelloService(
    val helloRepository: HelloRepository
) {

    private fun quoteId(id: String): String {
        return "'$id'"
    }

    fun getHello(): String {
        return "hello service"
    }

    fun getHelloWithId(id: String): String {
        val data = helloRepository.get(id)
        return "hello service ${quoteId(data)}"
    }

}