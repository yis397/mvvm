package com.example.mvvm.Domain

import com.example.mvvm.Core.PokemonRepository
import com.example.mvvm.Model.Pokemones
import javax.inject.Inject

class GetPokemonCaso @Inject constructor(private val repository:PokemonRepository) {

    suspend operator fun invoke():Pokemones=repository.getAllPokemon()
}