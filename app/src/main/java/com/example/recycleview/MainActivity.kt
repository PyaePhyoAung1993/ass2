package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview.adapter.CountryAdapter
import com.example.recycleview.adapter.PersonAdapter
import com.example.recycleview.adapter.PopularAdapter
import com.example.recycleview.model.Country
import com.example.recycleview.model.Person
import com.example.recycleview.model.Popular
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personList = ArrayList<Person>()
        personList.add(
            Person(
                R.drawable.j, "8 plus", "I phone",
                "352354", "72000KS"
            )
        )
        personList.add(
            Person(
                R.drawable.d, "HORS PINK LONK", "SLEEVE T Shirt",
                "for men", "15000KS"
            )
        )
        personList.add(
            Person(
                R.drawable.l, "Hyde Pink", "N41050",
                "Louis Vuition", "72000KS"
            )
        )
        personList.add(
            Person(
                R.drawable.k, "8 pluse", "I phone",
                "latest", "72000KS"
            )
        )
        personList.add(
            Person(
                R.drawable.f, "HORS PINK LONK", "SLEEVE T Shirt",
                "Lady Gaga", "72000KS"
            )
        )


        var countryList = ArrayList<Country>()
        countryList.add(Country(R.drawable.o, "Japan"))
        countryList.add(Country(R.drawable.q, "Korea"))
        countryList.add(Country(R.drawable.s, "China"))
        countryList.add(Country(R.drawable.u, "International"))


        var popularList = ArrayList<Popular>()
        popularList.add(
            Popular(
                "Iphone 8 plus", "Apple", "9800000KS",
                "1100000KS", R.drawable.iphone
            )
        )
        popularList.add(
            Popular(
                "GhostBed 11 inch", "Gel Memory Foam", "32500KS",
                "495000KS", R.drawable.w
            )
        )
        popularList.add(
            Popular(
                "Nintendo Switch", "and Red Joy-Con", "359000KS",
                "410000Ks", R.drawable.y
            )
        )
        popularList.add(
            Popular(
                "BELAROI Women", "Swing   Tunic ", "18990KS",
                "200000KS", R.drawable.x
            )
        )


//        var personAdapter = PersonAdapter(personList)
        //horizontal
//        recycleView.layoutManager = LinearLayoutManager(this,
//            LinearLayoutManager.HORIZONTAL,false)

        recycleView1.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = PersonAdapter(personList)
        }

        recycleView2.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = CountryAdapter(countryList)
        }
        recycleView3.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = PopularAdapter(popularList)
        }

    }
}