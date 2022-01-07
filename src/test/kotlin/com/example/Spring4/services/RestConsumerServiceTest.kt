package com.example.Spring4.services

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

internal class RestConsumerServiceTest {
    @Test
    fun `gets json`() {
        val restService = RestConsumerService()
        val res = restService.getRest() as List<JvmType.Object>
        println((res))
    }
}