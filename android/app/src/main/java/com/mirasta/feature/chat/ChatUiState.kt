package com.mirasta.feature.chat

import com.mirasta.core.model.Message

data class ChatUiState(
    val messages: List<Message> = emptyList(),
    val connected: Boolean = false
)
