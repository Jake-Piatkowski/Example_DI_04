package com.jbpi.exampledi03.providers

import okhttp3.logging.HttpLoggingInterceptor

class HttpLoggingInterceptorProvider {

    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {

        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        return httpLoggingInterceptor
    }
}
