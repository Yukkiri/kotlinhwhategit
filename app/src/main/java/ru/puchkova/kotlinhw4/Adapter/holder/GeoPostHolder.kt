package ru.puchkova.kotlinhw4.adapter.holder

import android.view.View
import kotlinx.android.synthetic.main.post_card.view.*
import ru.puchkova.kotlinhw4.models.GeoPost

class GeoPostHolder(itemView: View) : MainHolder(itemView){
    val mainText = itemView.mainText


    fun bindGeo(post: GeoPost) {
        super.bind(post)
        mainText.text = post.postBody
    }
}