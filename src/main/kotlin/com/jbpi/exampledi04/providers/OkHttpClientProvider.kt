package com.jbpi.exampledi04.providers

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

class OkHttpClientProvider(
    private val okHttpClientBuilder: OkHttpClient.Builder,
    private val httpLoggingInterceptor: HttpLoggingInterceptor
) {

    fun provideOkHttpClient(): OkHttpClient {

        return okHttpClientBuilder.addInterceptor(this.httpLoggingInterceptor).build()
    }
}
