package ru.my.uicommon.model

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable

@Immutable
sealed class BottomBarIcon {

    data class BottomBarIconWithContent(
        val text: String,
        val content: @Composable (BoxScope.() -> Unit)
    ) : BottomBarIcon()

    data class BottomBarIconWithRes(
        val text: String,
        @DrawableRes val iconRes: Int
    ) : BottomBarIcon()

}