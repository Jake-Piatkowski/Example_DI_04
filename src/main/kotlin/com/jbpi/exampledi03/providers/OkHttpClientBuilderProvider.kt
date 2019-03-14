package com.jbpi.exampledi03.providers

import okhttp3.OkHttpClient

class OkHttpClientBuilderProvider {

    fun provideOkHttpClientBuilder(): OkHttpClient.Builder {
        return OkHttpClient.Builder()
    }
}
