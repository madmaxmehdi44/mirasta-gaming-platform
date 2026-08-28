package com.mirasta.core.model

data class ChatMessage(
    val id: String,
    val senderId: String,
    val text: String,
    val timestamp: Long
)
