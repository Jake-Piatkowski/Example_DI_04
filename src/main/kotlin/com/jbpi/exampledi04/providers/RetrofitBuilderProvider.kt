package com.jbpi.exampledi04.providers

import retrofit2.Retrofit

class RetrofitBuilderProvider {

    fun provideRetrofitBuilder(): Retrofit.Builder {
        return Retrofit.Builder()
    }
}
