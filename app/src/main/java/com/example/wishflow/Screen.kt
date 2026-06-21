package com.example.wishflow

sealed class Screen(val route: String) {
    object HomeScreen: Screen("home_screen")
    object WishScreen: Screen("add_wish_screen")
}