package com.example.recipesapp.di

import com.example.recipesapp.common.Constants
import com.example.recipesapp.data.remote.RecipeApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): RecipeApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RecipeApi::class.java)
    }

//    @Provides
//    @Singleton
//    fun provideCoinRepository(api: CoinPaprikaApi): CoinRepository {
//        return CoinRepositoryImpl(api)
//    }
}
