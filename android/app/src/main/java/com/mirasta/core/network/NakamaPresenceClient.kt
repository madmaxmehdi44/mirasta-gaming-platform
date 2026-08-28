package com.mirasta.core.network

import kotlinx.coroutines.flow.Flow
import com.mirasta.core.model.Presence

interface NakamaPresenceClient {
    fun observePresence(): Flow<List<Presence>>
}
