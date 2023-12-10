package com.example.tugashadiahmessy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Home : Fragment() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

        imageId = arrayOf(
            R.drawable.makanan3,
            R.drawable.whiskas
        )

        heading = arrayOf(
            "asdgdjcjksdnjsdknskjc sahbdahxd",
            "sjabdjabdhxbsxa hsbcasjjjjh"

        )

//        newRecyclerView =findViewById(R.id.recyclerView)
//        newRecyclerView.layoutManager = linearLayoutManager(this)
//        newRecyclerView.setHasFixedSize(true)
//
//        newArrayList = arrayListOf()
    }

    companion object {
        fun newIntance(): Home {
            return Home()
        }
    }
}