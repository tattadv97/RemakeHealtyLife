package com.tattadv.remakehealtylife.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tattadv.remakehealtylife.DetailActivity
import com.tattadv.remakehealtylife.Healty
import com.tattadv.remakehealtylife.R

class ListHealtyAdapter (
    private val listHealty: ArrayList<Healty>,
    private val onItemClick: (Healty) -> Unit
): RecyclerView.Adapter<ListHealtyAdapter.ListViewHolder>(){

    //ViewHolder class untuk handle views di item recycler
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        //Properties pake lazy initialization buat better performance
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    //Create ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        //Inflate layout pake modern kotlin syntax
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.item_row_health, parent, false
        )
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val healty = listHealty[position]
        holder.imgPhoto.setImageResource(healty.photo)
        holder.tvName.text = healty.name
        holder.tvDetail.text = healty.detail

        //Handle item click
        holder.itemView.setOnClickListener {
            onItemClick(healty)
        }
    }

    override fun getItemCount(): Int = listHealty.size
}