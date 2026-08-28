package com.mirasta.core.network

import kotlinx.coroutines.flow.Flow
import com.mirasta.core.model.Message

interface NakamaChatClient {
    suspend fun sendMessage(text: String): Result<Unit>
    fun observeMessages(): Flow<Message>
}
