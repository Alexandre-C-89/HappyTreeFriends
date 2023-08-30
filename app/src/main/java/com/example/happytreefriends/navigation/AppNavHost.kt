package com.example.happytreefriends.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

/**
 * NAVIGATION
 *
 * Ici je déclare la variable navController et je
 * l'initialize avec la valeur rememberNavController
 *
 * Ensuite vient le NavHost qui prend en paramètre la variable navController et une startDestination
 * qui vous l'aurez devinez est le premier écran qui s'affiche quand on lance l'application
 *
 * On référence tous les composable et cela nous permets aussi de naviguer entre eux .
 */
@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = homeRoute
    ) {
        homeScreen(navigateToProfile = { navController.navigateToProfile() })
        profileScreen(navigateToHome = { navController.navigateToHome() })
    }

}