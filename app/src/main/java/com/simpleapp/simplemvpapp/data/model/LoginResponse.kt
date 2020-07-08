package com.simpleapp.simplemvpapp.data.model

data class LoginResponse(
    val login : Boolean,
    val success : Boolean,
    val message : String,
    var error: String
)