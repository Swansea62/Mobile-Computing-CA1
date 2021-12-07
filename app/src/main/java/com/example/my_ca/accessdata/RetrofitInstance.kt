package com.example.my_ca.accessdata

import com.example.plantapp.WEB_SERVICE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object RetrofitInstance {

    private val retrofit by lazy {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)
        Retrofit.Builder()
            .baseUrl(WEB_SERVICE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(httpClient.build())
            .build()
    }

    val api: PokemonAPI by lazy {
        retrofit.create(PokemonAPI::class.java)
    }
}