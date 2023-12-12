package com.example.databasetest.controlcenter

import android.util.Log
import com.example.databasetest.device.AirConditioner
import com.example.databasetest.device.Device
import com.example.databasetest.device.Light

val sampleUser = User(10001, "sample user", "China")
val sampleDeviceList = ArrayList<Device>()
val sampleOperationList = ArrayList<Operation>()

class ControlCenter(val user: User, val deviceList: ArrayList<Device>) {
//    fun findDevice(deviceID: Int): Device {
//
//    }

    fun addDevice() {

    }

    fun removeDevice() {

    }

    fun addRule() {

    }

    fun executeRule(rule: Rule) {
        val operationList = rule.operationList
        for (operation in operationList) {
            for (device in deviceList) {
                if (operation.deviceID == device.deviceID) {
                    device.changeOperation(operation)
                    Log.d("app",operation.deviceID.toString() + operation.operation + operation.para.toString())
                }
            }
        }
    }

    fun removeRule() {

    }

    fun getEnergyUsing() {

    }

    fun getEnergyUsage(): String {
        val stringBuffer = StringBuffer()
        for (device in deviceList) {
//            stringBuffer.append(device.deviceID.toString() + device.name + device.energyUsage.toString() + "\n")
        }
        return stringBuffer.toString()
    }

    fun userHealthTracing() {

    }

    fun ecoRecommendation() {

    }


}

fun initDevice(deviceList: ArrayList<Device>) {
    deviceList.add(Light(20001, "light1"))
    deviceList.add(Light(20002, "light2"))
    deviceList.add(AirConditioner(20003, "Air1"))
}

fun initOperation(operationList:ArrayList<Operation>) {
    operationList.add(Operation(20001, "turnOn", 0))
    operationList.add(Operation(20002, "turnOn", 0))
    operationList.add(Operation(20003, "turnOn", 0))
    operationList.add(Operation(20003, "changeTemp", 22))
}


