package com.plcoding.torrigoinvestmenttracker.crypto.presentation.coin_list

import com.plcoding.torrigoinvestmenttracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}