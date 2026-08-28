package com.mirasta.core.network

class NakamaSocketManager {
    private var connected = false

    suspend fun connect() {
        connected = true
    }

    suspend fun disconnect() {
        connected = false
    }

    fun isConnected(): Boolean = connected
}
