package com.plcoding.torrigoinvestmenttracker.crypto.presentation.coin_list

import com.plcoding.torrigoinvestmenttracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}