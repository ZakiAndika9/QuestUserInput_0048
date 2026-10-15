package com.example.pertemuan5

@Composable
fun FormDataDiri(modifier: Modifier){
        //variabel-variabel untuk mengingat nilai masukan dari keyboard
        var textNama by remember {mutableStateOf(value = "")}
        var textAlamat by remember {mutableStateOf(value = "")}
        var textJK by remember {mutableStateOf(value = "")}
        val gender:List<String> = listOf("Laki-laki","Perempuan")