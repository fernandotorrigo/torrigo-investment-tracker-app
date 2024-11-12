package com.plcoding.torrigoinvestmenttracker.crypto.presentation.coin_list.components

import androidx.compose.runtime.Immutable
import com.plcoding.torrigoinvestmenttracker.crypto.presentation.models.CoinUi

@Immutable
data class CoinListState(
    val isLoading: Boolean,
    val coins: List<CoinUi> = emptyList(),
    val selectedCoin: CoinUi? = null,
)