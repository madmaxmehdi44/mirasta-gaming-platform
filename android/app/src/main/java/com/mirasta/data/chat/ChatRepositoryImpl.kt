package com.mirasta.data.chat

import com.mirasta.core.model.Message
import com.mirasta.domain.chat.ChatRepository
import kotlinx.coroutines.flow.Flow

class ChatRepositoryImpl(
    private val source: NakamaChatDataSource
) : ChatRepository {

    override suspend fun sendMessage(text: String) {
        source.send(text)
    }

    override fun observeMessages(): Flow<Message> {
        return source.messages()
    }
}
