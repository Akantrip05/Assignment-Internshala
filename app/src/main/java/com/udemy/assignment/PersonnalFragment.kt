package com.udemy.assignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class PersonnalFragment : Fragment() {

    lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

       val view = inflater.inflate(R.layout.fragment_personnal, container, false)



        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)

        val model:ArrayList<Model> = ArrayList()
        val v1 = Model("Akanksha Tripathi","Jaunpur | Android Developer","Friendship","Hey there i am open to new connection","AT")
        val v2 = Model("Akanksha Tripathi","Jaunpur | Android Developer","Friendship","Hey there i am open to new connection","AT")
        val v3 = Model("Akanksha Tripathi","Jaunpur | Android Developer","Friendship","Hey there i am open to new connection","AT")
        val v4 = Model("Akanksha Tripathi","Jaunpur | Android Developer","Friendship","Hey there i am open to new connection","AT")
        val v5 = Model("Akanksha Tripathi","Jaunpur | Android Developer","Friendship","Hey there i am open to new connection","AT")
        val v6 = Model("Akanksha Tripathi","Jaunpur | Android Developer","Friendship","Hey there i am open to new connection","AT")
        val v7 = Model("Akanksha Tripathi","Jaunpur | Android Developer","Friendship","Hey there i am open to new connection","AT")
        val v8 = Model("Akanksha Tripathi","Jaunpur | Android Developer","Friendship","Hey there i am open to new connection","AT")
        val v9 = Model("Akanksha Tripathi","Jaunpur | Android Developer","Friendship","Hey there i am open to new connection","AT")


        model.add(v1)
        model.add(v2)
        model.add(v3)
        model.add(v4)
        model.add(v5)
        model.add(v6)
        model.add(v7)
        model.add(v8)
        model.add(v9)

        val adapter = Adapter(model)
        recyclerView.adapter = adapter


        return view

    }
}