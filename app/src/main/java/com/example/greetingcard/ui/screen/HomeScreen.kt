package com.example.greetingcard.ui.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "mainScreen"
    ) {
        composable("mainScreen") {
            MainScreen(navController)
        }
        composable("signUpScreen") {
            SignUpScreen(navController)
        }
        composable("SignInScreen") {
            SignInScreen(navController)
        }
        composable("SuccessfulScreen") {
            SuccessfulScreen()
        }
        composable("ForgotPassword") {
            ForgotPasswordScreen()
        }
    }
}
