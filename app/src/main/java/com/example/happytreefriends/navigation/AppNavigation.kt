package com.example.happytreefriends.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.happytreefriends.home.screen.HomeRoute
import com.example.happytreefriends.profile.screen.ProfileRoute
import com.example.happytreefriends.profile.screen.ProfileScreen

const val homeRoute = "home_route"

fun NavController.navigateToHome() {
    navigate(homeRoute)
}

fun NavGraphBuilder.homeScreen(
    navigateToProfile: () -> Unit
) {
    composable(homeRoute) {
        HomeRoute(
            navigateToProfile = navigateToProfile
        )
    }
}

const val profileRoute = "profile_route"

fun NavController.navigateToProfile() {
    navigate(profileRoute)
}

/**
 * Ici navigateToHome fait directement référence
 * à la méthode dans le composable HomeRoute
 */
fun NavGraphBuilder.profileScreen(
    navigateToHome: () -> Unit
) {
    composable(profileRoute) {
        ProfileRoute (navigateToHome = navigateToHome)
    }
}