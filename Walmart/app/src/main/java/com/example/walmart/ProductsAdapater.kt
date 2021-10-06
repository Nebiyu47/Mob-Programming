package com.example.walmart

import android.content.Context
import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.layouttts.view.*


class ProductsAdapater: BaseAdapter {
    var productsList = ArrayList<Product>()
    var context : Context? = null

    constructor(context: Context, productList: ArrayList<Product>) : super() {
        this.context = context
        this.productsList = productList
    }

    override fun getView(index: Int, p1: View?, p2: ViewGroup?): View {
        var product = productsList[index]
        var inflater = context!!.getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var productView = inflater.inflate(R.layout.layouttts, null)
        productView.imageView.setImageResource(product.image)
        productView.textView.text = product.name
        if (product.name.equals("Apple Watch") || product.name.equals("MacBook Pro")) {
            productView.imageView.setOnClickListener{
                makeSomeIntents(context,product.name)
            }
        }
        return productView

    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }


    override fun getCount(): Int {
        return productsList.size
    }

    fun makeSomeIntents(context: Context?,destination : String){

        if (destination.equals("Apple Watch")){
            val intent = Intent(context,AppleIphone::class.java)
            context?.startActivity(intent)
        }else {
            val intent = Intent(context,AppleLaptopActivity::class.java)
            context?.startActivity(intent)
        }
    }

}