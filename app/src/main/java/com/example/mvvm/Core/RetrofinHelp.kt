package com.example.mvvm.Core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofinHelp {
    fun getHttpData():Retrofit{

      return  Retrofit.Builder()
          .baseUrl("https://pokeapi.co/api/v2/")
          .addConverterFactory(GsonConverterFactory.create())
          .build()
    }
}