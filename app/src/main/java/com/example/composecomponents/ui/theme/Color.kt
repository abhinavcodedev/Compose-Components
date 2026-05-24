package com.example.composecomponents.ui.theme

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// App Colors

val PrimaryLight = Color(0xFF2962FF)
val SecondaryLight = Color(0xFF03DAC5)
val BackgroundLight = Color(0xFFF5F5F5)

val SurfaceLight = Color(0xFFFFFFFF)

val TextPrimary = Color(0xFF111111)
val TextSecondary = Color(0xFF666666)

// Material3 Scheme

val AppColorScheme = lightColorScheme(

    primary = PrimaryLight,
    secondary = SecondaryLight,

    background = BackgroundLight,
    surface = SurfaceLight,

    onPrimary = Color.White,
    onSecondary = Color.Black,

    onBackground = TextPrimary,
    onSurface = TextPrimary
)