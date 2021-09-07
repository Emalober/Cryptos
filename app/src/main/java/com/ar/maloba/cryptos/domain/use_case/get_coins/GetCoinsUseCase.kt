package com.ar.maloba.cryptos.domain.use_case.get_coins

import com.ar.maloba.cryptos.domain.entities.Coin
import com.ar.maloba.cryptos.domain.entities.CoinDetail
import com.ar.maloba.cryptos.domain.repository.CoinRepository
import com.ar.maloba.cryptos.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins()
            emit(Resource.Success<List<Coin>>(coins))
        } catch (e: HttpException) {
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error ocurred!"))
        } catch (e: IOException) {
            emit(Resource.Error<List<Coin>>("Couldn't reach server. Check your internet connection!"))
        }
    }
}