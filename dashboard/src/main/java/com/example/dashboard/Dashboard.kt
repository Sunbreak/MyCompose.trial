package com.example.dashboard

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@Composable
fun Dashboard(
    viewModel: DashboardViewModel
) {
    Text(viewModel.uiState)
}

@HiltViewModel
class DashboardViewModel @Inject constructor(
) : ViewModel() {
    val uiState = "DashboardViewModel"
}