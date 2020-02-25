package ru.puchkova.kotlinhw4.adapter.holder

import android.view.View
import android.widget.TextView
import android.widget.VideoView
import kotlinx.android.synthetic.main.ads_post.view.*
import ru.puchkova.kotlinhw4.R
import ru.puchkova.kotlinhw4.models.AdsPost
import ru.puchkova.kotlinhw4.models.Post

class AdsPostHolder(itemView: View) : MainHolder(itemView){
    val delete = itemView.delete
    fun bindAds(post: AdsPost) {
        super.bind(post)
        val mainText = itemView.findViewById<TextView>(R.id.mainText)
        mainText.text = post.postBody

        delete.setOnClickListener{
            itemView.visibility = View.GONE
        }
    }
}