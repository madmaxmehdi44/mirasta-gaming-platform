package com.mirasta.core.model

data class Presence(
    val userId: String,
    val username: String,
    val online: Boolean = true
)
