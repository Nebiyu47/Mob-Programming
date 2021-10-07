package com.example.walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_listofitem.*


class Shopping : AppCompatActivity() {

    var productsAdapter : ProductsAdapater? = null
    var productsList = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listofitem)
        productsList.add(Product("Apple Phone",R.drawable.download5,"Black", 23344.00,""))
        productsList.add(Product("Apple Laptop",R.drawable.download3, "Silver", 2000.00,""))
        productsList.add(Product("cloth",R.drawable.downlaod6,"black",199.00,""))
        productsList.add(Product("Jacket",R.drawable.download4,"black",50.00,""))

        productsAdapter = ProductsAdapater(this,productsList)


        gridView.adapter = productsAdapter

        getUserName()
    }


    fun getUserName(){
        val intent = getIntent()
        val str = intent.getStringExtra("userName")
        userNameTxtView.text = "Welcome " + str + "!"

    }
}