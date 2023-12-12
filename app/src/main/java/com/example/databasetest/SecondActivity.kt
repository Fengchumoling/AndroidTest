package com.example.databasetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.databasetest.controlcenter.ControlCenter
import com.example.databasetest.controlcenter.Operation
import com.example.databasetest.controlcenter.Rule
import com.example.databasetest.controlcenter.initDevice
import com.example.databasetest.controlcenter.initOperation
import com.example.databasetest.controlcenter.sampleDeviceList
import com.example.databasetest.controlcenter.sampleOperationList
import com.example.databasetest.controlcenter.sampleUser
import com.example.databasetest.device.AirConditioner
import com.example.databasetest.device.Device

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initDevice(sampleDeviceList)
        initOperation(sampleOperationList)
        val rule = Rule(30000, "Rule1", sampleOperationList)
        val controlCenter = ControlCenter(sampleUser, sampleDeviceList)
        val getEnergyUsage:Button = findViewById(R.id.getEnergyUsage)
        val changeOperation:Button = findViewById(R.id.changeOperations)
        val startRule:Button = findViewById(R.id.startRule)
        changeOperation.setOnClickListener {
//            val device = controlCenter.deviceList[2]
//            device.changeOperation(Operation("turnOn",0))
//            device.changeOperation(Operation("changeTemp", 23))
//            val air = device as AirConditioner
//            Toast.makeText(this, air.tempreture.toString(), Toast.LENGTH_SHORT).show()
//            Toast.makeText(this, device.status.toString(), Toast.LENGTH_SHORT).show()
        }

        getEnergyUsage.setOnClickListener {
            val energyUsage = controlCenter.getEnergyUsage()
            Toast.makeText(this, energyUsage, Toast.LENGTH_SHORT).show()
        }

        startRule.setOnClickListener {
            controlCenter.executeRule(rule)
            Toast.makeText(this, "Start Rule click", Toast.LENGTH_SHORT).show()
        }
    }
}