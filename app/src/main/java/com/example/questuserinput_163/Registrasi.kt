package com.example.questuserinput_163

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

@Composable
fun FormRegistrasi(modifier: Modifier){
    var nama by remember { mutableStateOf("") }
    var kota by remember { mutableStateOf("") }
    var tanggalLahir by remember { mutableStateOf("") }
    var rt by remember { mutableStateOf("") }
    var rw by remember { mutableStateOf("") }
    var umur by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }

    val jenisKelamin = listOf("Laki-laki", "Perempuan")
}