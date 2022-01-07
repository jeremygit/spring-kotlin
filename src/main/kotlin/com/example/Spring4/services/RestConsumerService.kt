package com.example.Spring4.services

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class RestConsumerService {

    fun getRest(): Object? {
        val res = RestTemplate().getForObject("https://restcountries.com/v3.1/name/australia", Object::class.java)
        // ObjectMapper
        // val mapped = ObjectMapper
        return res
    }

}