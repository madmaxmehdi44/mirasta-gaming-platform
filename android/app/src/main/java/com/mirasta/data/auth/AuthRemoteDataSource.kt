package com.mirasta.data.auth

import com.mirasta.core.network.NakamaClient
import com.mirasta.core.model.User

class AuthRemoteDataSource(
    private val nakamaClient: NakamaClient
) {
    suspend fun login(deviceId: String): User {
        return nakamaClient.authenticate(deviceId)
    }
}
