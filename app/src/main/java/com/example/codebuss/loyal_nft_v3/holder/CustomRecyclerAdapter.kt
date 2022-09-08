package com.example.codebuss.loyal_nft_v3.holder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.codebuss.loyal_nft_v3.R

class CustomRecyclerAdapter:  RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>()  {

    private var numberRW = 10

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById(R.id.main_image_of_square)
    }

    override fun getItemCount() = numberRW

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.rw_for_loyal_nfst, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.image.setImageResource(R.drawable.ic_tools)

    }


}