package com.example.recipesapp.data.remote.repository

import com.example.recipesapp.data.remote.RecipeApi
import com.example.recipesapp.domain.RecipeRepository
import com.example.recipesapp.model.Recipes
import javax.inject.Inject

class RecipeRepositoryImp @Inject constructor(
    private val api: RecipeApi
) : RecipeRepository {
    override suspend fun getRecipe(): Recipes {
        return api.getRecipeInformation()
    }
}