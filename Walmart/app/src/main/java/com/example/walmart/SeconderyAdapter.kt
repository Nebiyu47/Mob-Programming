package com.example.walmart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_laptop_detail.view.*
import kotlinx.android.synthetic.main.activity_laptop_detail.view.product_title
import kotlinx.android.synthetic.main.laptop_item.view.*


class ElectronicAdapter(var item: ArrayList<Product>, var clickListener: OnProductClickListener) : RecyclerView.Adapter<ElectronicViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElectronicViewHolder {
        var electronicViewHolder: ElectronicViewHolder
        electronicViewHolder = ElectronicViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.laptop_item, parent, false))
        return electronicViewHolder
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: ElectronicViewHolder, position: Int) {
        holder.intialize(item.get(position), clickListener)

    }

}

class ElectronicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    var productTitle = itemView.product_title
    var productPrice = itemView.prduct_price
    var productColor = itemView.prduct_color
    var productImage = itemView.product_image

    fun intialize(item: Product, action:OnProductClickListener){
        productTitle.text = item.name
        productImage.setImageResource(item.image)
        productPrice.text = item.price.toString()
        productColor.text = item.color

        itemView.setOnClickListener {
            action.onItemClick(item, adapterPosition)
        }
    }
}

interface OnProductClickListener {
    fun onItemClick(item: Product, position: Int)
}