package com.marcsedev.pokedex

import com.google.gson.annotations.SerializedName

data class PokemonResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("sprites") val sprites: Sprites,
    @SerializedName("types") val types: List<Type>,//lista de instancias de la clase Type que representan los tipos del Pokémon.
    @SerializedName("game_indices") val gameIndices: List<GameIndex>// lista de instancias de la clase GameIndex que representan los índices de juego del Pokémon.
)
//representa la imagen del Pokémon, y tiene una sola propiedad frontDefault que es la URL de la imagen.
data class Sprites(
    @SerializedName("front_default") val frontDefault: String
)
// representa un tipo de Pokémon, y tiene una propiedad type que es una instancia de la clase TypeName que representa el nombre del tipo.
data class Type(
    @SerializedName("type") val typeName: TypeName
)

data class TypeName(
    @SerializedName("name") val name: String
)
//La clase GameIndex representa un índice de juego del Pokémon, y tiene dos propiedades: gameIndex, que es el índice del juego, y version, que es una instancia de la clase Version que representa el nombre del juego.
data class GameIndex(
    @SerializedName("game_index") val gameIndex: Int,
    @SerializedName("version") val version: Version
)
//La clase Version representa el nombre de un juego, y tiene una propiedad name que es el nombre del juego.

data class Version(
    @SerializedName("name") val name: String
)
