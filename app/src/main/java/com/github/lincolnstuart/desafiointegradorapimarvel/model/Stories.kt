package com.github.lincolnstuart.desafiointegradorapimarvel.model

data class Stories(
    val available: Int,
    val collectionURI: String,
    val items: List<ItemXX>,
    val returned: Int
)