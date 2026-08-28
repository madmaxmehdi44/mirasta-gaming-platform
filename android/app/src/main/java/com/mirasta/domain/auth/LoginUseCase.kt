package com.mirasta.domain.auth

import com.mirasta.core.model.User

class LoginUseCase(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(deviceId: String): Result<User> {
        return repository.login(deviceId)
    }
}
