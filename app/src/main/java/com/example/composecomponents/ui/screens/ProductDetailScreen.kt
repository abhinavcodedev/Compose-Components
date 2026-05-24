package com.example.composecomponents.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.composecomponents.ui.components.BodyText
import com.example.composecomponents.ui.components.PrimaryButton
import com.example.composecomponents.ui.components.TitleText

@Composable
fun ProductDetailScreen() {

    var quantity by remember { mutableIntStateOf(1) }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        AsyncImage(
            model = "https://picsum.photos/400",
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            TitleText(
                text = "Cheese Burger"
            )
            Spacer(modifier = Modifier.height(8.dp))
            BodyText(
                text = "Delicious burger with fresh ingredients and cheese."
            )
            Spacer(modifier = Modifier.height(24.dp))
            QuantitySelector(
                quantity = quantity,
                onIncrease = {
                    quantity++
                },
                onDecrease = {
                    if (quantity > 1) quantity--
                }
            )
            Spacer(modifier = Modifier.weight(1f))
            PrimaryButton(
                text = "Add To Cart"
            ) {

            }
        }
    }
}

@Composable
fun QuantitySelector(
    quantity: Int,
    onIncrease: () -> Unit,
    onDecrease: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        FilledIconButton(
            onClick = onDecrease
        ) {
            Icon(
                imageVector = Icons.Default.Remove,
                contentDescription = null
            )
        }

        Text( text = quantity.toString(),
            style = MaterialTheme.typography.titleLarge
        )

        FilledIconButton(
            onClick = onIncrease
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null
            )
        }
    }
}