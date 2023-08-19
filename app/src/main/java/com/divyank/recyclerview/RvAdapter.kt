package com.divyank.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.divyank.recyclerview.databinding.RvItemBinding

class RvAdapter(var datalist:ArrayList<RvModel>,var context:Context):RecyclerView.Adapter<RvAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        var view = LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false)
//        return MyViewHolder(view)
        var binding=RvItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

   override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       anim(holder.itemView)
       holder.bindng.profile.setImageResource(datalist.get(position).profile)
       holder.bindng.name.text=datalist.get(position).name
       holder.bindng.address.text=datalist.get(position).address
       holder.itemView.setOnClickListener{
           Toast.makeText(context,datalist.get(position).name,Toast.LENGTH_LONG).show()
       }

   }
   inner class MyViewHolder(var bindng: RvItemBinding): RecyclerView.ViewHolder(bindng.root)
    fun anim(view:View){
        var animation=AlphaAnimation(0.0f,1.0f)
        animation.duration=2000
        view.startAnimation(animation)
    }
}