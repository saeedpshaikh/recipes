package com.example.recipesapp.domain

import com.example.recipesapp.model.Recipes

interface RecipeRepository {

    suspend fun getRecipe(): Recipes
}