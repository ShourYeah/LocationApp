package com.example.locationapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LocationViewModel:ViewModel() {

    private val _location = mutableStateOf<LocationData?>(null)
    val location: State<LocationData?> = _location


    // We will be shielding our var _location from outside but at the same time we will be allowing it for overwriting
    // This is just like getter and setter
    fun updateLocation(newLocation: LocationData){
        _location.value = newLocation
    }
}