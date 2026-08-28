package com.mirasta.core.model

data class Room(
    val id: String,
    val name: String,
    val memberCount: Int = 0
)
