package com.jbpi.exampledi04

import com.jbpi.exampledi04.providers.*
import io.reactivex.functions.Consumer

fun main() {

    val retrofitBuilderProvider = RetrofitBuilderProvider()
    val okHttpClientBuilderProvider = OkHttpClientBuilderProvider()
    val httpLoggingInterceptorProvider = HttpLoggingInterceptorProvider()
    val okHttpClientProvider = OkHttpClientProvider(
        okHttpClientBuilderProvider.provideOkHttpClientBuilder(),
        httpLoggingInterceptorProvider.provideHttpLoggingInterceptor()
    )
    val gsonProvider = GsonProvider()
    val retrofitProvider = RetrofitProvider(
        retrofitBuilderProvider.provideRetrofitBuilder(),
        okHttpClientProvider.provideOkHttpClient(), gsonProvider.provideGson()
    )
    val twitchWebApiServiceProvider = TwitchWebApiServiceProvider(retrofitProvider.provideRetrofit())
    val streamsDownloader = StreamsDownloader(twitchWebApiServiceProvider.provideTwitchWebApiService())

    streamsDownloader.download(Consumer { apiResponseStreams ->
        System.out.println("Stream count: " + apiResponseStreams.data.size)

        for (apiStream in apiResponseStreams.data) {
            System.out.println(apiStream.title)
        }
    })
}