package ru.puchkova.kotlinhw4.adapter.holder

import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.post_card.view.*
import ru.puchkova.kotlinhw4.R
import ru.puchkova.kotlinhw4.models.IPost
import ru.puchkova.kotlinhw4.models.Post

class TextPostHolder(itemView: View) : MainHolder(itemView){

    var mainText = itemView.mainText

    fun bindText(post: IPost) {
        super.bind(post)
        mainText.text = post.postBody
    }
}