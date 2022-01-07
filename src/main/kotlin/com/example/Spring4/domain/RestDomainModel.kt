package com.example.Spring4.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class RestDomainModel(
    var x: String,
    var y: String
)