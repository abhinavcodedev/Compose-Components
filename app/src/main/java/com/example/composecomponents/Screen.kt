package com.example.composecomponents

sealed class Screen(val route: String) {

    data object Home : Screen("home")

    data object ProductDetail : Screen("product_detail")
}