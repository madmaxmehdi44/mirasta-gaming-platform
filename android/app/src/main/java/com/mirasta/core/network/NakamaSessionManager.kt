package com.mirasta.core.network

/**
 * Keeps Nakama session handling isolated from UI and features.
 */
class NakamaSessionManager {

    private var sessionId: String? = null

    fun saveSession(id: String) {
        sessionId = id
    }

    fun currentSession(): String? = sessionId

    fun clear() {
        sessionId = null
    }
}
