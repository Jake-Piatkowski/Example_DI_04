package com.jbpi.exampledi03.providers

import com.jbpi.exampledi03.TwitchWebApiService
import retrofit2.Retrofit

class TwitchWebApiServiceProvider(private val retrofit: Retrofit) {

    fun provideTwitchWebApiService(): TwitchWebApiService {

        return this.retrofit.create(TwitchWebApiService::class.java)
    }
}
