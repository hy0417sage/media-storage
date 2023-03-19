package com.hy0417sage.mediastorage.data.api

import com.hy0417sage.mediastorage.data.model.ResultSearchImage
import com.hy0417sage.mediastorage.data.model.ResultSearchVClip
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface KakaoAPI {

    @GET("/v2/search/image?")
    suspend fun getSearchImage(
        @Header("Authorization") key: String,
        @Query("query") query: String?,
    ): ResultSearchImage

    @GET("/v2/search/vclip?")
    suspend fun getSearchVClip(
        @Header("Authorization") key: String,
        @Query(value = "query", encoded = true) to: String?,
    ): ResultSearchVClip

}