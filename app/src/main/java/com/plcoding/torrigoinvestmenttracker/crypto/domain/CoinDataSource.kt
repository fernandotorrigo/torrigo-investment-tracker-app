package com.plcoding.torrigoinvestmenttracker.crypto.domain

import com.plcoding.torrigoinvestmenttracker.core.domain.util.Result

import com.plcoding.torrigoinvestmenttracker.core.domain.util.NetworkError

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}