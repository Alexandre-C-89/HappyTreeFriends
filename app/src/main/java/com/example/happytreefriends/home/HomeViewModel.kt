package com.example.happytreefriends.home

import android.app.Application
import com.example.happytreefriends.home.model.HomeUiData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val app: Application
) {

    /**private val _uiData = MutableStateFlow(HomeUiData())
    private uiData: StateFlow<HomeUiData> = _uiData*/


    fun goToProfile(navigateToProfile: () -> Unit){
        navigateToProfile
    }

}