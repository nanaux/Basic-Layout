package com.codelab.basiclayouts.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.codelab.basiclayouts.R

private val fontFamilyKulim = FontFamily(
    Font(R.font.kulim_park_regular),
    Font(R.font.kulim_park_light, FontWeight.Light)
)

private val fontFamilyLato = FontFamily(
    Font(R.font.lato_regular),
    Font(R.font.lato_bold, FontWeight.Bold)
)

val typography = Typography(
    h1 = TextStyle(
        fontFamily = fontFamilyKulim,
        fontWeight = FontWeight.Light,
        fontSize = 30.sp
    ),
    h2 = TextStyle(
        fontFamily = fontFamilyKulim,
        fontWeight = FontWeight.Light,
        fontSize = 24.sp
    ),
    h3 = TextStyle(
        fontFamily = fontFamilyKulim,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = fontFamilyLato,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontFamily = fontFamilyLato,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    body2 = TextStyle(
        fontFamily = fontFamilyLato,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),
    button = TextStyle(
        fontFamily = fontFamilyLato,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        textAlign = TextAlign.Center
    ),
    caption = TextStyle(
        fontFamily = fontFamilyLato,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
)
