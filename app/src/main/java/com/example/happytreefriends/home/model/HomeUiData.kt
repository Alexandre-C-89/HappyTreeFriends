package com.example.happytreefriends.home.model

data class HomeUiData(
    val name: String,
    val age: String,
)

fun HomeUiData.nameError(): String? {
    if (name.isEmpty()) {
        return "Veuillez remplir le champ !"
    }
    return null
}
