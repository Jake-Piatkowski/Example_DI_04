package com.jbpi.exampledi03.providers

import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitProvider(
    private val retrofitBuilder: Retrofit.Builder,
    private val okHttpClient: OkHttpClient,
    private val gson: Gson
) {

    fun provideRetrofit(): Retrofit {

        return this.retrofitBuilder
            .baseUrl("https://api.twitch.tv/")
            .client(this.okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(this.gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }
}
