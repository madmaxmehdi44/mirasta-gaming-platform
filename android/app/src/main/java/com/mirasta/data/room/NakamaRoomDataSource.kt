package com.mirasta.data.room

import com.mirasta.core.model.Room

class NakamaRoomDataSource {

    suspend fun createRoom(name: String): Room {
        return Room(
            id = "nakama-room",
            name = name,
            memberCount = 0
        )
    }

    suspend fun joinRoom(roomId: String) {
        // Nakama match join integration point
    }

    suspend fun leaveRoom() {
        // Nakama match leave integration point
    }
}
