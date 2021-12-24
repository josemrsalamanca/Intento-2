package com.example.elbajonmistico2.feature.menu.data

import com.example.elbajonmistico2.feature.menu.data.remote.MenuApi

class MenuRepository(private val menuApi: MenuApi) {
    suspend fun getMenu() = menuApi.obtemerMenu()
}