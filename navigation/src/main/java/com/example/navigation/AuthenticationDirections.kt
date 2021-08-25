package com.example.navigation

import androidx.navigation.compose.NamedNavArgument

object AuthenticationDirections {
    val root = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()

        override val destination = "connect"
    }

    val authentication = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()

        override val destination = "authentication"
    }

    val dashboard = object : NavigationCommand {
        override val arguments = emptyList<NamedNavArgument>()

        override val destination = "dashboard"
    }
}