package com.example.my_ca

class SampleDataProvider {

    companion object {
        private val sampleName1 = "Pidgeot"
        private val sampleName2 = "Squirtle"
        private val sampleName3 = "Absol"
        private val sampleName4 = "Clefairy"
        private val sampleName5 = "Kirlia"

        fun getPokemon() = arrayListOf(
            PokemonEntity(sampleName1),
            PokemonEntity(sampleName2),
            PokemonEntity(sampleName3),
            PokemonEntity(sampleName4),
            PokemonEntity(sampleName5)
        )
    }
}