package com.example.navigation

import androidx.navigation.compose.NamedNavArgument

object DashboardDirections {
    val root = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()

        override val destination = "home"
    }
}