package com.mirasta.core.network

import com.mirasta.core.model.User

class NakamaAuth {

    suspend fun authenticate(deviceId: String): User {
        // Real Nakama SDK authentication will be connected here.
        return User(
            id = deviceId,
            username = "player"
        )
    }
}
