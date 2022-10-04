package com.example.mvvm.Model

import retrofit2.Response
import retrofit2.http.GET

interface PokemonService {

    @GET("pokemon?limit=10&offset=0")
    suspend fun getAllPokemons():Response<Pokemones>
}