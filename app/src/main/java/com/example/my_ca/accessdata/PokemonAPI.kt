package com.example.my_ca.accessdata

import com.example.my_ca.data.PokemonResponse
import com.example.pokemonapp.data.PokemonEntity
import retrofit2.Response
import retrofit2.http.GET

interface PokemonAPI {
    @GET("https://pokeapi.co/api/v2/pokemon/")
    suspend fun getPokemon() : PokemonResponse
}