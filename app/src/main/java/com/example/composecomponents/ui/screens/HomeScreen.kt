package com.example.composecomponents.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecomponents.model.DummyData
import com.example.composecomponents.model.DummyData.foodCategories
import com.example.composecomponents.model.DummyData.foodItems
import com.example.composecomponents.ui.components.AppSearchBar
import com.example.composecomponents.ui.components.BodyText
import com.example.composecomponents.ui.components.ScreenContainer
import com.example.composecomponents.ui.components.TitleText

@Composable
fun HomeScreen(onFoodClick: ()->Unit) {
    ScreenContainer {
        Spacer(modifier = Modifier.height(12.dp))
        TitleText(
            text = "Find Your Favorite Food"
        )
        Spacer(modifier = Modifier.height(8.dp))
        BodyText(
            text = "Fast delivery at your doorstep"
        )
        Spacer(modifier = Modifier.height(24.dp))
        AppSearchBar(
            value = "",
            onValueChange = {}
        )
        Spacer(modifier = Modifier.height(24.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(foodCategories) {
                CategoryItem(
                    title = it
                )
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(foodItems) {
                FoodCard(
                    food = it,
                    onClick = onFoodClick
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {

    MaterialTheme {
        HomeScreen(onFoodClick = {})
    }
}