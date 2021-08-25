package com.example.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.mycompose.ui.theme.MyComposeTheme
import com.example.navigation.AuthenticationDirections
import com.example.navigation.DashboardDirections

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeTheme {
                val navController = rememberNavController()
                NavHost(
                    navController,
                    startDestination = AuthenticationDirections.root.destination
                ) {
                    navigation(
                        startDestination = AuthenticationDirections.authentication.destination,
                        route = AuthenticationDirections.root.destination
                    ) {
                        composable(AuthenticationDirections.authentication.destination) {
                            Text("Authentication")
                        }
                    }
                    navigation(
                        startDestination = AuthenticationDirections.dashboard.destination,
                        route = DashboardDirections.root.destination
                    ) {
                        composable(AuthenticationDirections.dashboard.destination) {
                            Text("Dashboard")
                        }
                    }
                }
            }
        }
    }
}