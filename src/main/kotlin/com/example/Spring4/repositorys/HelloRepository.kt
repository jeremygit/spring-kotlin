package com.example.Spring4.repositorys

import org.springframework.stereotype.Repository

@Repository
class HelloRepository {
    fun get(id: String): String {
        return "[repo $id]"
    }
}