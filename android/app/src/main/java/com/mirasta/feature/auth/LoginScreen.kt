package com.mirasta.feature.auth

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun LoginScreen(
    onLogin: () -> Unit
) {
    Button(onClick = onLogin) {
        Text("Login")
    }
}
