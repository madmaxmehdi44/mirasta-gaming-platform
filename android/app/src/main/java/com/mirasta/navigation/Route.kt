package com.mirasta.navigation

sealed class Route(val value: String) {
    data object Login : Route("login")
    data object Home : Route("home")
    data object Room : Route("room")
}
