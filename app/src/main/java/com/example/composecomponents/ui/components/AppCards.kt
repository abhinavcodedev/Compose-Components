package com.example.composecomponents.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AppCard(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large,
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            content()
        }
    }
}

/*@Preview(showBackground = true)
@Composable
fun AppCardPreview() {
    MaterialTheme {
        AppCard(
            modifier = Modifier.padding(16.dp)
        ) {
            TitleText("User Profile")
            Spacer(modifier = Modifier.height(8.dp))
            BodyText("Android Developer")
        }
    }
}*/

@Preview(showBackground = true)
@Composable
fun AppCardPreview() {
    AppCard {
        TitleText("User Profile")
        Spacer(modifier = Modifier.height(8.dp))
        BodyText("Android Developer")
    }
}