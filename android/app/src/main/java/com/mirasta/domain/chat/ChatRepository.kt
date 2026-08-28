package com.mirasta.domain.chat

import com.mirasta.core.model.Message

interface ChatRepository {
    suspend fun sendMessage(text: String)
    fun observeMessages(): kotlinx.coroutines.flow.Flow<Message>
}
