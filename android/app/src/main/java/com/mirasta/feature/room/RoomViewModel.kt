package com.mirasta.feature.room

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RoomViewModel : ViewModel() {

    private val _state = MutableStateFlow(RoomUiState())
    val state: StateFlow<RoomUiState> = _state.asStateFlow()

    fun joinRoom(roomId: String) {
        _state.value = _state.value.copy(
            loading = true
        )
    }

    fun leaveRoom() {
        _state.value = RoomUiState()
    }
}
