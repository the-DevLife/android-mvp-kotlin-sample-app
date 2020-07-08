package com.simpleapp.simplemvpapp.data.network

import com.simpleapp.simplemvpapp.data.model.LoginResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @FormUrlEncoded
    @POST(ApiEndPoints.LOGIN_URL)
    fun validateCredentialsApiCall(
        @Field("username") username : String,
        @Field("password") password : String
    ): Call<LoginResponse>
}