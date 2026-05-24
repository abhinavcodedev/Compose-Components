package com.example.composecomponents

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composecomponents.ui.screens.HomeScreen
import com.example.composecomponents.ui.screens.ProductDetailScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onFoodClick = {
                    navController.navigate(
                        Screen.ProductDetail.route
                    )
                }
            )
        }
        composable(Screen.ProductDetail.route) {
            ProductDetailScreen()
        }
    }
}