package com.example.location

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LocationViewModel:ViewModel(){
    private val _location = mutableStateOf<LocationDate?>(null)
    val location :State<LocationDate ?> = _location

    fun upDateLocation(newLocation:LocationDate){
        _location.value=newLocation
    }
}
