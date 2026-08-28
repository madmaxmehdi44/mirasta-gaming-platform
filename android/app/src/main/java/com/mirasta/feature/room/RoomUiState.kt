package com.mirasta.feature.room

import com.mirasta.core.model.Room
import com.mirasta.core.model.Presence


data class RoomUiState(
    val room: Room? = null,
    val members: List<Presence> = emptyList(),
    val connected: Boolean = false,
    val loading: Boolean = false,
    val error: String? = null
)
