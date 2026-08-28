package com.mirasta.core.storage

interface SessionStorage {
    suspend fun save(token: String)
    suspend fun get(): String?
    suspend fun clear()
}
