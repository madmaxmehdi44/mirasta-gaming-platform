package com.mirasta.domain.room

import com.mirasta.core.model.Room

interface RoomRepository {
    suspend fun createRoom(name: String): Result<Room>
    suspend fun joinRoom(roomId: String): Result<Unit>
    suspend fun leaveRoom()
}
