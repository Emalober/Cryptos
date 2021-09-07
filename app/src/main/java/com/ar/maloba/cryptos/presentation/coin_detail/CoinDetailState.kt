package com.ar.maloba.cryptos.presentation.coin_detail

import com.ar.maloba.cryptos.domain.entities.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val detail: CoinDetail? = null,
    val error: String = ""
)
