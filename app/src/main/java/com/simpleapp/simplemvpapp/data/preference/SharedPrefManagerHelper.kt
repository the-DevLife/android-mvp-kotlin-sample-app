package com.simpleapp.simplemvpapp.data.preference

interface SharedPrefManagerHelper {
    fun setLogin(token: String)
    fun getLoginStatus(): Boolean
    fun clearData()
}