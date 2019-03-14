package com.jbpi.exampledi03.providers

import retrofit2.Retrofit

class RetrofitBuilderProvider {

    fun provideRetrofitBuilder(): Retrofit.Builder {
        return Retrofit.Builder()
    }
}
