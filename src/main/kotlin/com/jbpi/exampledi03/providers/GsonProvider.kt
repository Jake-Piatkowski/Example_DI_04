package com.jbpi.exampledi03.providers

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder

class GsonProvider {

    fun provideGson(): Gson {

        val gsonBuilder = GsonBuilder()

        return gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create()
    }
}
