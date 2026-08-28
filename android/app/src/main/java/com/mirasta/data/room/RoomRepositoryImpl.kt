package com.mirasta.data.room

import com.mirasta.core.model.Room
import com.mirasta.domain.room.RoomRepository

class RoomRepositoryImpl(
    private val dataSource: NakamaRoomDataSource
) : RoomRepository {

    private var currentRoom: Room? = null

    override suspend fun createRoom(name: String): Result<Room> {
        val result = dataSource.create(name)
        if (result.isSuccess) {
            currentRoom = result.getOrNull()
        }
        return result
    }

    override suspend fun joinRoom(roomId: String): Result<Unit> {
        dataSource.join(roomId)
        return Result.success(Unit)
    }

    override suspend fun leaveRoom() {
        dataSource.leave()
        currentRoom = null
    }
}
