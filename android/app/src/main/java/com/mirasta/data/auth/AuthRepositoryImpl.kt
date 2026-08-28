package com.mirasta.data.auth

import com.mirasta.core.model.User
import com.mirasta.domain.auth.AuthRepository

class AuthRepositoryImpl(
    private val remoteDataSource: AuthRemoteDataSource
) : AuthRepository {

    override suspend fun login(deviceId: String): Result<User> {
        return runCatching {
            remoteDataSource.login(deviceId)
        }
    }

    override suspend fun logout() {
        // Session cleanup will be connected here
    }

    override fun currentUser(): User? {
        return null
    }
}
