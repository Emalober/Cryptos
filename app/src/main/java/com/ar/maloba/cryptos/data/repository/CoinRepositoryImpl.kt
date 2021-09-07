package com.ar.maloba.cryptos.data.repository

import com.ar.maloba.cryptos.data.remote.CoinPaprikaApi
import com.ar.maloba.cryptos.data.remote.dto.toCoin
import com.ar.maloba.cryptos.data.remote.dto.toCoinDetail
import com.ar.maloba.cryptos.domain.entities.Coin
import com.ar.maloba.cryptos.domain.entities.CoinDetail
import com.ar.maloba.cryptos.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<Coin> {
         return api.getCoins().map { it.toCoin() }
    }

    override suspend fun getCoinById(coinId: String): CoinDetail {
        return api.getCoinById(coinId).toCoinDetail()
    }
}