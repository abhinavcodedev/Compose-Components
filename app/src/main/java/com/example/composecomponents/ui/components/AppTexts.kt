package com.example.composecomponents.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleText(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.headlineMedium
    )
}

@Composable
fun HeadingText(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.titleLarge
    )
}

@Composable
fun BodyText(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.bodyLarge
    )
}

@Composable
fun CaptionText(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.bodySmall,
        color = MaterialTheme.colorScheme.onSurfaceVariant
    )
}

/*@Preview(showBackground = true)
@Composable
fun TitleTextPreview() {
    MaterialTheme {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            TitleText("Title Text")
            Spacer(modifier = Modifier.height(8.dp))
            HeadingText("Heading Text")
            Spacer(modifier = Modifier.height(8.dp))
            BodyText("Body Text")
            Spacer(modifier = Modifier.height(8.dp))
            CaptionText("Caption Text")
        }
    }
}*/

@Preview(showBackground = true)
@Composable
fun TitleTextPreview() {
    TitleText(text = "Compose Title")
}

@Preview(showBackground = true)
@Composable
fun HeadingTextPreview() {
    HeadingText(text = "Compose Heading")
}

@Preview(showBackground = true)
@Composable
fun BodyTextPreview() {
    BodyText(text = "Compose Body")
}

@Preview(showBackground = true)
@Composable
fun CaptionTextPreview() {
    CaptionText(text = "Compose Caption")
}