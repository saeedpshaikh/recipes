package com.example.recipesapp.domain.usecase.get_recipe

import com.example.recipesapp.common.Resource
import com.example.recipesapp.domain.RecipeRepository
import com.example.recipesapp.model.Recipes
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetRecipeUseCase @Inject constructor(
    private val repository: RecipeRepository
) {
    operator fun invoke(): Flow<Resource<Recipes>> = flow {
        try {
            emit(Resource.Loading<Recipes>())
            val recipes = repository.getRecipe()
            emit(Resource.Success<Recipes>(recipes))
        } catch(e: HttpException) {
            emit(Resource.Error<Recipes>(e.localizedMessage ?: "An unexpected error occured"))
        } catch(e: IOException) {
            emit(Resource.Error<Recipes>("Couldn't reach server. Check your internet connection."))
        }
    }
}