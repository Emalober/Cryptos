package com.ar.maloba.cryptos.presentation.coin_list

import com.ar.maloba.cryptos.domain.entities.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
