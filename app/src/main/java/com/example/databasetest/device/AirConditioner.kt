package com.example.databasetest.device

import com.example.databasetest.controlcenter.Operation

class AirConditioner(deviceID:Int, name:String, var temperature: Int = 26):Device(deviceID) {
    fun changeTemp(temp: Int) {
        this.temperature = temp
    }


    override fun changeOperation(operation:Operation) {
        when (operation.operation) {
            "turnOn" -> status = true
            "turnOff" -> status = false
            "changeTemp" -> changeTemp(operation.para)
        }
    }
}

