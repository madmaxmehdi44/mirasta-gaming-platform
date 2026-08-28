package com.mirasta.core.network

/**
 * Boundary layer between Mirasta and Nakama SDK.
 * Features should depend on this abstraction instead of Nakama directly.
 */
class NakamaClient {

    suspend fun authenticate(deviceId: String): String {
        // TODO: Connect Nakama authentication
        return deviceId
    }
}
