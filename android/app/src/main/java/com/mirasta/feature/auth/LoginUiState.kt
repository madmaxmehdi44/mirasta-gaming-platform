package com.mirasta.feature.auth

import com.mirasta.core.model.User

data class LoginUiState(
    val loading: Boolean = false,
    val user: User? = null,
    val error: String? = null
)
