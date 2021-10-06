package com.example.walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class AppleIphone : AppCompatActivity() {

    var clothingList = arrayOf("iphone 1", "iphone 2", "iphone 3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apple_phone)

        val adapter = ArrayAdapter(this, R.layout.listofapplephone, clothingList)
        val listView: ListView = findViewById(R.id.listview_applewatch)
        listView.adapter  = adapter

        listView.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val itemClothingView = listView.getItemAtPosition(position) as String
                Toast.makeText(applicationContext, "You have selected out of i phone ${itemClothingView}", Toast.LENGTH_SHORT).show()
            }
        }

    }
}