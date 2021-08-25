package com.example.authentication

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@Composable
fun Authentication(
    viewModel: AuthenticationViewModel
) {
    Text(viewModel.uiState)
}

@HiltViewModel
class AuthenticationViewModel @Inject constructor(
) : ViewModel() {
    val uiState = "AuthenticationViewModel"
}