package com.mirasta.core.model

data class Message(
    val id: String,
    val senderId: String,
    val text: String,
    val timestamp: Long
)
