package com.example.bluetoothexample.presentation

import com.example.bluetoothexample.domain.chat.BluetoothDevice

data class BluetoothUIState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList()
)