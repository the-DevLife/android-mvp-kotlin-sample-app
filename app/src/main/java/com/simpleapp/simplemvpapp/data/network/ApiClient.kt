package com.simpleapp.simplemvpapp.data.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private val logger = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    private val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logger)
            .addInterceptor{ chain ->
                val original = chain.request()

                val originalHttpUrl = original.url()
                val url = originalHttpUrl.newBuilder()
                    .build()

                val requestBuilder =  original.newBuilder()
                    .method(original.method(), original.body())
                    .url(url)

                val request = requestBuilder.build()
                    chain.proceed(request)
            }.build()

    val instance : ApiService by lazy {
//        If your BASE_URL Change after login replace 'by lazy' with 'get()' and put return before retrofit.create(ApiService::class.java)
        val retrofit = Retrofit.Builder()
            .baseUrl(ApiEndPoints.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

        retrofit.create(ApiService::class.java)
    }
}