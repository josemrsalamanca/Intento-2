package com.example.elbajonmistico2.feature.menu.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface MenuApi {
    //https://mocki.io/v1/00cff39e-73e0-4abe-a642-fd9137eac223
    @GET("00cff39e-73e0-4abe-a642-fd9137eac223")

    suspend fun obtemerMenu() : Response<MenuResponse>
}