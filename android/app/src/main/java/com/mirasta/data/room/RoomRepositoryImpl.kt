package com.mirasta.data.room

import com.mirasta.core.model.Room
import com.mirasta.domain.room.RoomRepository

class RoomRepositoryImpl : RoomRepository {

    private var currentRoom: Room? = null

    override suspend fun createRoom(name: String): Result<Room> {
        val room = Room(
            id = "local-room",
            name = name,
            memberCount = 1
        )
        currentRoom = room
        return Result.success(room)
    }

    override suspend fun joinRoom(roomId: String): Result<Unit> {
        return Result.success(Unit)
    }

    override suspend fun leaveRoom() {
        currentRoom = null
    }
}
