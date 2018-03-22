package com.example.rahul.justchat.adapter

import android.icu.util.Measure
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.rahul.justchat.R
import com.example.rahul.justchat.datamodel.Message
import com.squareup.picasso.Picasso

/**
 * Created by rahulgirase on 3/22/18.
 */
class ListAdapter(val message: List<Message>) : RecyclerView.Adapter<CustomViewHolder>() {
    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        val contactImage = holder?.view?.findViewById<ImageView>(R.id.contactImage)
        val contactName = holder?.view?.findViewById<TextView>(R.id.contactName)
        val textMessage = holder?.view?.findViewById<TextView>(R.id.messageText)

        contactName?.text = message.get(position).name
        textMessage?.text = message.get(position).text
        Picasso.get().load(message.get(position).imageUrl).into(contactImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {

        val layoutInflater = LayoutInflater.from(parent?.context)
        val rowItem = layoutInflater.inflate(R.layout.list_row_item, parent, false)

        return CustomViewHolder(rowItem)
    }

    override fun getItemCount(): Int {
        message.size
    }


}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    init {
        view.setOnClickListener {

        }
    }
}