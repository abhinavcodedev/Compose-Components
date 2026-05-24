package com.example.composecomponents.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ScreenContainer(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        content()
    }
}

/*@Preview(showBackground = true)
@Composable
fun ScreenContainerPreview() {
    MaterialTheme {
        ScreenContainer {
            TitleText("Compose Design System")
            Spacer(modifier = Modifier.height(16.dp))
            BodyText("Reusable UI Components")
        }
    }
}*/

@Preview(showBackground = true)
@Composable
fun ScreenContainerPreview() {
    ScreenContainer {
        TitleText("Compose Design System")
        Spacer(modifier = Modifier.height(16.dp))
        BodyText("Reusable UI Components")
        Spacer(modifier = Modifier.height(16.dp))
        PrimaryButton(text = "Continue") {}
    }
}