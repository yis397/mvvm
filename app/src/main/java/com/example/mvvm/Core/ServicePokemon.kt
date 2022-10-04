package com.example.mvvm.Core

import com.example.mvvm.Model.PokemonService
import com.example.mvvm.Model.Pokemones
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ServicePokemon @Inject constructor(private val http:PokemonService) {


    suspend fun getPokemons():Pokemones{
        return withContext(Dispatchers.IO){
            val response=http.getAllPokemons()
            response.body()!!
        }


    }
}