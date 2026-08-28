package com.mirasta.data.room

class NakamaRoomDataSourceImpl {
    suspend fun join(roomId: String): Boolean {
        return true
    }

    suspend fun leave(): Boolean {
        return true
    }
}
