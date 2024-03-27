package com.example.datafriend

class data_teman {
    var nama: String? = null
    var alamat: String? = null
    var no_hp: String? = null
    var key: String? = null

    //membuat konstruktor kosong untuk membaca data snapshot
    constructor() {}

    //Konstruktor dengan beberapa parameter, untuk mendapatkan Input data dari user

    constructor(nama: String?, alamat: String?, no_hp: String?) {
        this.nama = nama
        this.alamat = alamat
        this.no_hp = no_hp
    }
}