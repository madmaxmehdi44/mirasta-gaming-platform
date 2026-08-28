package com.mirasta.feature.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mirasta.domain.auth.LoginUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LoginViewModel(
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(LoginUiState())
    val state: StateFlow<LoginUiState> = _state

    fun login(deviceId: String) {
        viewModelScope.launch {
            _state.value = LoginUiState(loading = true)

            val result = loginUseCase(deviceId)

            result.fold(
                onSuccess = { user ->
                    _state.value = LoginUiState(user = user)
                },
                onFailure = { error ->
                    _state.value = LoginUiState(error = error.message)
                }
            )
        }
    }
}
