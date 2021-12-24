package com.example.elbajonmistico2.feature.menu.ui

import androidx.recyclerview.widget.RecyclerView
import com.example.elbajonmistico2.databinding.ItemListBinding
import com.example.elbajonmistico2.feature.menu.data.modelo.Products
import com.squareup.picasso.Picasso

class MenuViewHolder(private val binding: ItemListBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(products: Products){
        with(binding){
            tv1.text = products.name
            tv2.text = products.price.toString()
            tv3.text = products.description

            Picasso.get().load(products.urlImage).into(imageView)
        }
    }
}