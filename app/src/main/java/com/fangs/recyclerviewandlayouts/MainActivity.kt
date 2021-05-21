package com.fangs.recyclerviewandlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvNumbers = findViewById<RecyclerView>(R.id.rv_countingNumbers)
        //scaffold
        rvNumbers.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvNumbers.adapter = NumbersAdapter(this,10)



        val rvAlphabets = findViewById<RecyclerView>(R.id.rv_alphabets)

        val rvRomanNumerals = findViewById<RecyclerView>(R.id.rv_roman_numerals)


    }
}