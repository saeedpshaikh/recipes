package com.example.recipesapp.data.remote

import com.example.recipesapp.model.Recipes
import retrofit2.http.GET

interface RecipeApi {

    @GET()
    suspend fun getRecipeInformation(): Recipes
}