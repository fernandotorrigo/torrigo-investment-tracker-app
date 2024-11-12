package com.plcoding.torrigoinvestmenttracker.crypto.data.networking

import com.plcoding.torrigoinvestmenttracker.core.data.networking.constructUrl
import com.plcoding.torrigoinvestmenttracker.core.data.networking.safeCall
import com.plcoding.torrigoinvestmenttracker.core.domain.util.NetworkError
import com.plcoding.torrigoinvestmenttracker.core.domain.util.Result
import com.plcoding.torrigoinvestmenttracker.core.domain.util.map
import com.plcoding.torrigoinvestmenttracker.crypto.data.networking.dto.CoinsResponseDto
import com.plcoding.torrigoinvestmenttracker.crypto.domain.Coin
import com.plcoding.torrigoinvestmenttracker.crypto.domain.CoinDataSource
import com.plcoding.torrigoinvestmenttracker.crypto.mappers.toCoin
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteCoinDataSource(
    private val httpClient: HttpClient
) : CoinDataSource {
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinsResponseDto> {
            httpClient.get(
                urlString = constructUrl("/assets")
            )
        }.map { response ->
            response.data.map { it.toCoin() }
        }
    }
}
