package com.mirasta.feature.room

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RoomScreen(
    state: RoomUiState
) {
    Text(
        text = state.room?.name ?: "Room"
    )
}
