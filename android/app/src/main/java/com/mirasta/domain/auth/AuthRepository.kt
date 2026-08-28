package com.mirasta.domain.auth

import com.mirasta.core.model.User

interface AuthRepository {
    suspend fun login(deviceId: String): Result<User>
    suspend fun logout()
    fun currentUser(): User?
}
