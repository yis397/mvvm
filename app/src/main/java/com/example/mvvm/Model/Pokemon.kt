package com.example.mvvm.Model

data class Pokemones (
    val count: Long,
    val next: String,
    val previous: Any? = null,
    val results: List<Pokemon>
)

data class Pokemon (
    val name: String,
    val url: String
)
