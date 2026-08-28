package com.mirasta.core.network

sealed interface RealtimeConnectionState {
    data object Disconnected : RealtimeConnectionState
    data object Connecting : RealtimeConnectionState
    data object Connected : RealtimeConnectionState
    data class Error(val message: String) : RealtimeConnectionState
}
