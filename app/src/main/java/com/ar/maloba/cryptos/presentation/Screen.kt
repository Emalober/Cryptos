package com.ar.maloba.cryptos.presentation

sealed class Screen(val route: String) {
    object CoinListScreen: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("route_detail_screen")
}
