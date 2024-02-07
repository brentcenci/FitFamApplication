package com.brentcodes.fitfamapplication.ui.screens

sealed class Screen (val route: String) {
    object LaunchScreen: Screen("LAUNCH_SCREEN")
    object LoginScreen: Screen("LOGIN_SCREEN")
    object SignUpScreen: Screen("SIGNUP_SCREEN")
    object HomeScreen: Screen("HOME_SCREEN")
    object ProfileScreen: Screen("PROFILE_SCREEN")
    object PlanScreen: Screen("PLAN_SCREEN")
}
