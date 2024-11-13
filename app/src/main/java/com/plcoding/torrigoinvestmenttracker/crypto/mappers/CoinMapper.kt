package com.plcoding.torrigoinvestmenttracker.crypto.mappers

import com.plcoding.torrigoinvestmenttracker.crypto.data.networking.dto.CoinDto
import com.plcoding.torrigoinvestmenttracker.crypto.domain.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        name = name,
        rank = rank,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr,
    )
}