package com.nphausg.app.compose.inclusive.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nphausg.app.compose.inclusive.screen.HomeScreen
import com.nphausg.app.compose.inclusive.screen.LoginScreen
import com.nphausg.app.compose.inclusive.screen.ProfileScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("profile") { ProfileScreen(navController) }
    }
}