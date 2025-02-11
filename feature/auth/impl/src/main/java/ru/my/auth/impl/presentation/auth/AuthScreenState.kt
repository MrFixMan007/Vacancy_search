package ru.my.auth.impl.presentation.auth

import androidx.compose.runtime.Immutable
import ru.my.base.api.screenmodel.model.UIState

@Immutable
data class AuthScreenState(
    val email: String = "",
    val isContinueButtonEnabled: Boolean = false,
    val isLoginWithPasswordEnabled: Boolean = false,
) : UIState