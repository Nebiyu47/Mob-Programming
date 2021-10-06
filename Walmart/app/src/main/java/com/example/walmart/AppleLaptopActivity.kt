package com.example.walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_laptop.*


class AppleLaptopActivity : AppCompatActivity() , OnProductClickListener {

    lateinit var productlist: ArrayList<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laptop)

        productlist = ArrayList()
        addingNewProductofAppleLaptop()
        rv_electronic.layoutManager = LinearLayoutManager(this)
        rv_electronic.addItemDecoration(DividerItemDecoration(this,1))
        rv_electronic.adapter = ElectronicAdapter(productlist, this)
    }

    fun addingNewProductofAppleLaptop() {
        productlist.add(Product("2019 Apple MacBook Pro", price = 2750.00,color =  " Silver", image = R.drawable.rrrrr,desc =  "Ninth-generation 8-Core Intel Core i9 Processor"))
        productlist.add(Product("MacBook Pro (16-inch, 2019)",  price =90300.99,color = "Silver",image = R.drawable.sppppp,desc =  "16‑inch (diagonal) LED‑backlit display with IPS technology; 3072‑by‑1920 native resolution at 226 pixels per inch with support for millions of colors"))
        productlist.add(Product("MacBook Pro Retina",  price =5400.50,color = "Sliver",image = R.drawable.sssssf,desc =  "16‑inch (diagonal) LED‑backlit display with IPS technology; 3072‑by‑1920 native resolution at 226 pixels per inch with support for millions of colors"))
        productlist.add(Product("Apple 13.3",  price =99050.88,color = "Black",image = R.drawable.mmmm,desc =  "features Apple's first chip designed specifically for Mac. The Apple M1 integrates the CPU, GPU, Neural Engine, I/O,"))

    }

    override fun onItemClick(item: Product, position: Int) {

        var intent = Intent(this, MacBookDetailActivity::class.java)
        intent.putExtra("Product_Title", item.name)
        intent.putExtra("Product_Description", item.description)
        intent.putExtra("Product_Color", item.color)
        intent.putExtra("Product_Image", item.image.toString())
        startActivity(intent)
    }
}