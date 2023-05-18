package com.example.recipesapp

sealed class Screen(val route: String) {
    object RecipeListScreen: Screen("recipe_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")
}
