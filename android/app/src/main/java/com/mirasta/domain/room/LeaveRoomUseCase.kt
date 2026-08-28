package com.mirasta.domain.room

class LeaveRoomUseCase(
    private val repository: RoomRepository
) {
    suspend operator fun invoke() {
        repository.leaveRoom()
    }
}
