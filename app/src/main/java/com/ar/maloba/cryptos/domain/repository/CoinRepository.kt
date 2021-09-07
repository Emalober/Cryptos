package com.ar.maloba.cryptos.domain.repository

import com.ar.maloba.cryptos.domain.entities.*

interface CoinRepository {

    suspend fun getCoins(): List<Coin>

    suspend fun getCoinById(coinId: String): CoinDetail
}