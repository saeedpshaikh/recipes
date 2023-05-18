package com.example.recipesapp.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dagger.hilt.android.lifecycle.HiltViewModel


@Composable
fun RecipeListScreen(
    navController: NavController,
   // viewModel: RecipeListViewModel = hiltViewModel()
            //viewModel: MyViewModel = viewModel()

            //viewModel: RecipeListViewModel = viewModel()




) {

     val mainViewModel: RecipeListViewModel  = hiltViewModel()

    // val state = viewModel.state.value
    Box(modifier = Modifier.fillMaxSize()) {
        /*LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(state.recipes?.extendedIngredients) { it ->
                CoinListItem(
                    coin = coin,
                    onItemClick = {
                        navController.navigate(Screen.CoinDetailScreen.route + "/${coin.id}")
                    }
                )
            }
        }
        if(state.error.isNotBlank()) {
            Text(
                text = state.error,
                color = MaterialTheme.colors.error,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .align(Alignment.Center)
            )
        }
        if(state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }*/
    }
}