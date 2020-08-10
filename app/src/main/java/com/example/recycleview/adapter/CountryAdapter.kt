package com.example.recycleview.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import com.example.recycleview.model.Country
import kotlinx.android.synthetic.main.item_country.view.*
import kotlinx.android.synthetic.main.item_person.view.imageView

class CountryAdapter(var countryList: ArrayList<Country>) :
    RecyclerView.Adapter<CountryAdapter.PersonViewHolder>() {

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bind(country: Country) {
            itemView.imageView.setImageResource(country.image)
            itemView.txtCounty.text = country.name


        }
    }

    //choose layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_country,
            parent, false
        )
        return PersonViewHolder(view)
    }

    //count
    override fun getItemCount(): Int {
        return countryList.size

    }

    //position
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(countryList[position])
    }
}