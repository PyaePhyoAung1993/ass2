package com.example.recycleview.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import com.example.recycleview.model.Person
import com.example.recycleview.model.Popular
import kotlinx.android.synthetic.main.item_popular.view.*

class PopularAdapter(var popularList: ArrayList<Popular>) :
    RecyclerView.Adapter<PopularAdapter.PersonViewHolder>() {

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bind(popular: Popular) {

            itemView.txt1.text = popular.name
            itemView.txt2.text = popular.name1
            itemView.txt3.text = popular.name2
            itemView.txt4.text = popular.name3
            itemView.image1.setImageResource(popular.image)


        }
    }

    //choose layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_popular,
            parent, false
        )
        return PersonViewHolder(view)
    }

    //count
    override fun getItemCount(): Int {
        return popularList.size

    }

    //position
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(popularList[position])
    }
}