package com.example.mvvm.UI.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import com.example.mvvm.Domain.GetPokemonCaso
import com.example.mvvm.Model.Frase
import com.example.mvvm.Model.FraseProvider
import com.example.mvvm.Model.Pokemon
import com.example.mvvm.Model.Pokemones
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FraseViewModel @Inject constructor(
    private val getPokemones:GetPokemonCaso
) :ViewModel() {
    val fraseModel=MutableLiveData<Pokemon>()
    var listaPokemon= mutableListOf<Pokemon>()

    fun fraseRandom(){
        fraseModel.postValue(listaPokemon[FraseProvider.getRandom()])
    }
     fun onCreate(){
         viewModelScope.launch {
             val result=getPokemones()
             listaPokemon= result.results as MutableList<Pokemon>
             fraseModel.postValue(listaPokemon[0])
         }
    }
}