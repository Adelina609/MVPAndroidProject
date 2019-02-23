package com.github.kornilovmikhail.mvpandroidproject.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import com.github.kornilovmikhail.mvpandroidproject.models.Event
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_view.view.*

class EventAdapter(private var items: List<Event>): RecyclerView.Adapter<EventAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent?.context).inflate(R.layout.rv_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size;
    }

    override fun onBindViewHolder(holder: EventAdapter.ViewHolder, position: Int) {
        holder.title. = items[position]
        holder.time.text = items[position]
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var title:String? = null
        var time:String? = null
        init {
            title = itemView.findViewById(R.id.title)
            time = itemView.findViewById(R.id.time)
        }
    }


}