package com.example.elbajonmistico2.feature.menu.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.elbajonmistico2.feature.menu.data.MenuRepository
import com.example.elbajonmistico2.feature.menu.data.remote.MenuResponse
import kotlinx.coroutines.launch
import retrofit2.Response

class MenuViewModel(private val menuReposirory: MenuRepository):ViewModel(){
    private val mutableState = MutableLiveData<MenuResponse>()
    fun state() : LiveData<MenuResponse> = mutableState
    fun getMenu() {
        viewModelScope.launch {
            val menu = menuReposirory.getMenu()
            handleState(menu)
        }
    }

    private fun handleState(menu: Response<MenuResponse>) {
        if(menu.isSuccessful){
            handleBody(menu.body())
        }else{
            //TODO
        }
    }

    private fun handleBody(body: MenuResponse?) {
        body?.let { safebody->
            mutableState.postValue(safebody)
        }
    }
}