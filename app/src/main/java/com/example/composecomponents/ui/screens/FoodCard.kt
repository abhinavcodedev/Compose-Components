package com.example.composecomponents.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.composecomponents.model.FoodModel
import com.example.composecomponents.ui.components.AppCard
import com.example.composecomponents.ui.components.BodyText
import com.example.composecomponents.ui.components.CaptionText
import com.example.composecomponents.ui.components.TitleText

@Composable
fun FoodCard(
    food: FoodModel,
    onClick: ()-> Unit
) {
    AppCard(
        modifier = Modifier.clickable { onClick() }
    )  {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = food.image,
                contentDescription = null,
                modifier = Modifier
                    .size(90.dp)
                    .clip(MaterialTheme.shapes.medium),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                TitleText(
                    text = food.name
                )
                Spacer(modifier = Modifier.height(4.dp))
                BodyText(
                    text = food.description
                )
                Spacer(modifier = Modifier.height(8.dp))
                CaptionText(
                    text = "$${food.price}"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FoodCardPreview() {
    MaterialTheme {
        FoodCard(
            food = FoodModel(
                name = "Cheese Burger",
                description = "Delicious burger with fresh cheese",
                image = "https://picsum.photos/200",
                price = 12
            ),
            onClick = {}
        )
    }
}