package com.marcsedev.pokedex

import com.google.gson.annotations.SerializedName

data class PokemonResponse(
    val id: Int,
    val name: String,
    val sprites: Sprites,
    val types: List<Type>,
    val gameIndices: List<GameIndex>
)

data class Sprites(
    @SerializedName("front_default") val frontDefault: String
)

data class Type(
    val type: TypeName
)

data class TypeName(
    val name: String
)

data class GameIndex(
    @SerializedName("game_index") val gameIndex: Int,
    val version: Version
)

data class Version(
    val name: String
)
