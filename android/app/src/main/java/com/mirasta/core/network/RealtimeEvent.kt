package com.mirasta.core.network

sealed class RealtimeEvent {
    data class UserJoined(val userId: String): RealtimeEvent()
    data class UserLeft(val userId: String): RealtimeEvent()
    data class MessageReceived(val text: String): RealtimeEvent()
}
