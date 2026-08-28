package com.mirasta.domain.room

class JoinRoomUseCase(
    private val repository: RoomRepository
) {
    suspend operator fun invoke(roomId: String) {
        repository.joinRoom(roomId)
    }
}
