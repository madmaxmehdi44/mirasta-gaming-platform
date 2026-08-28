package com.mirasta.core.network

interface NakamaMatchClient {
    suspend fun joinRoom(roomId: String): Result<Unit>
    suspend fun leaveRoom(): Result<Unit>
}
