package com.example.datafriend

import android.annotation.SuppressLint
import android.app.LauncherActivity.ListItem
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter (private val dataTeman: ArrayList<data_teman>, context: Context) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    private val context: Context

    //view holder digunakan untuk menyimpan referensi dari view-view
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val  Nama: TextView
        val  Alamat: TextView
        val  NoHP: TextView
        val ListItem: LinearLayout

        //menginisialisasi view yang terpasang pada layout Recycler View
        init {
            Nama = itemView.findViewById(R.id.namax)
            Alamat = itemView.findViewById(R.id.alamatx)
            NoHP = itemView.findViewById(R.id.no_hpx)
            ListItem = itemView.findViewById(R.id.list_item)
        }
    }

    //membuat view untuk menyimpan dan memasang layout yang digunakan pada Recycler View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val V: View = LayoutInflater.from(parent.getContext()).inflate(
            R.layout.view_design, parent, false)
        return ViewHolder(V)
    }

    @SuppressLint("SetTextI18n")
    //mengambil nilai atau value pada Recycler View berdasarkan posisi tertentu
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val Nama: String? = dataTeman.get(position).nama
        val Alamat: String? = dataTeman.get(position).alamat
        val NoHP: String? = dataTeman.get(position).no_hp

    //masukkan nilai atau value kedalam view
    holder.Nama.text = "Nama: $Nama"
    holder.Alamat.text = "Alamat: $Alamat"
    holder.NoHP.text = "NoHP: $NoHP"
    holder.ListItem.setOnLongClickListener(
        object : View.OnLongClickListener {
            override fun onLongClick(v: View?): Boolean {
                return true
            }
        })
    }

    //menghitung ukuran atau jumlah data yang akan ditampilkan pdaa Recycler View
    override fun getItemCount(): Int {
        return dataTeman.size
    }

    //membuat Konstruktor, untuk menerima input dari database
    init {
        this.context = context
    }
}