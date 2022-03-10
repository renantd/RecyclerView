package br.dev.com.recyclerview.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import br.dev.com.recyclerview.R
import br.dev.com.recyclerview.model.ItemsViewModel
import br.dev.com.recyclerview.viewholder.RecyclerViewHolder

    /*  Adapter
     *  Classe responsável por associar a lista de conteúdo/objeto a view
     * correspondente.Onde cada objeto da lista será um item da lista.É no Adapter
     * onde se define se um item será exibido ou não */
class RecyclerViewAdapter(private val nomes: List<String>): RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {

    /*  ViewHolder
     *  É a referência para a view que é parte visual de cada item da lista, que será
     *  replicada para todos elementos. */
    class RecyclerViewHolder(view : View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.itemList_tv)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list, viewGroup , false))
    }

    override fun onBindViewHolder(rViewHolder: RecyclerViewHolder, position: Int) {
        rViewHolder.textView.text = nomes[position]
    }

    override fun getItemCount(): Int {
       //Log.e("App", "Size : ${nomes.size}")
       return nomes.size //ok
    }

}