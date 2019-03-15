package com.jbpi.exampledi04

import com.jbpi.exampledi04.data.ApiResponseStreams
import io.reactivex.functions.Consumer

internal class StreamsDownloader(private val twitchWebApiService: TwitchWebApiService) {

    fun download(action: Consumer<ApiResponseStreams>) {

        val streamsHomm3 = this.twitchWebApiService.getStreamsHomm3()
        streamsHomm3.subscribe(action)
    }
}