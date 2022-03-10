package br.dev.com.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.dev.com.recyclerview.adapter.RecyclerViewAdapter
import br.dev.com.recyclerview.model.ItemsViewModel

class MainActivity : AppCompatActivity() {

    private val itemList = ArrayList<String>()
    private lateinit var recyclerAdap: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rv)
        recyclerAdap = RecyclerViewAdapter(itemList)

        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = recyclerAdap

        itemList.add("Item 1")
        itemList.add("Item 2")
        itemList.add("Item 3")
        itemList.add("Item 4")
        itemList.add("Item 5")
        recyclerAdap.notifyDataSetChanged()
    }

    private fun initRecycler(){
        val recyclerView: RecyclerView = findViewById(R.id.rv)
        recyclerAdap = RecyclerViewAdapter(itemList)

        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = recyclerAdap
        prepareItems()
    }
    private fun prepareItems() {
        itemList.add("Item 1")
        itemList.add("Item 2")
        itemList.add("Item 3")
        itemList.add("Item 4")
        itemList.add("Item 5")
        recyclerAdap.notifyDataSetChanged()
    }
}