package com.example.mvvm.Core

import com.example.mvvm.Model.PokemonService
import com.example.mvvm.Model.Pokemones
import retrofit2.create
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val servicePokemon: ServicePokemon)  {

    suspend fun getAllPokemon():Pokemones{
        val response=servicePokemon.getPokemons()
        return response
    }
}