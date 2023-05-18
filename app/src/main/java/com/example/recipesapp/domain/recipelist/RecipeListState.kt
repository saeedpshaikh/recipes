package com.example.recipesapp.domain.recipelist

import com.example.recipesapp.model.Recipes

data class RecipeListState(
    val isLoading: Boolean = false,
    var  recipes: Recipes? = null,
    val error: String = ""
)
