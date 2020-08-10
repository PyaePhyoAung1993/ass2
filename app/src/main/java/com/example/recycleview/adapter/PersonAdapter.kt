package com.example.recycleview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import com.example.recycleview.model.Person
import kotlinx.android.synthetic.main.item_person.view.*

class PersonAdapter(var personList: ArrayList<Person>) :
    RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bindPerson(person: Person) {
            itemView.imageView.setImageResource(person.image)
            itemView.t1.text = person.name
            itemView.t2.text = person.name1
            itemView.t3.text = person.name2
            itemView.t4.text = person.name3


        }
    }

    //choose layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_person,
            parent, false
        )
        return PersonViewHolder(view)
    }

    //count
    override fun getItemCount(): Int {
        return personList.size

    }

    //position
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bindPerson(personList[position])
    }
}