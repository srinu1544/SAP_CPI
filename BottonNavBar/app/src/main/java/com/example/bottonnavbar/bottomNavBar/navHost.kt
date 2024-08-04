package com.example.bottonnavbar.bottomNavBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Nav(navController : NavHostController) {

   // val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){

        composable(route = "Home") {
            Home(navController)
        }

        composable(route = "Chat") {
            Chat(navController)
        }
        composable(route = "Settings"){
            Settings(navController)
        }

    }
}