package com.acm.recyclerview

import android.renderscript.ScriptGroup
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.acm.recyclerview.databinding.ItemFlowerBinding

class FlowerAdapter(val flowerList: ArrayList<Flower>) :
    RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {
    inner class FlowerViewHolder(val binding: ItemFlowerBinding) :
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        val binding = ItemFlowerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FlowerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return flowerList.size

    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.binding.txtFlower.text = flowerList.get(position).flower_name
        holder.binding.price.text=flowerList.get(position).flower_price.toString()
        holder.binding.img.setImageResource(flowerList.get(position).flower_img)
    }
}