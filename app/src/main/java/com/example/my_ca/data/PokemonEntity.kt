package com.example.my_ca.data

data class PokemonEntity(
    var id: Int,
    var name: String,
    var type: String,
    var height: Float,
    var weight: Float
) {
    constructor() : this(id, "", "", height, weight)

    constructor(id: Int, name: String, type: String, height: Float, weight: Float) :
            this(id, name, type, height, weight)
}
