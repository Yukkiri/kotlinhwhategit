package ru.puchkova.kotlinhw4.adapter.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.post_card.view.*
import ru.puchkova.kotlinhw4.R
import ru.puchkova.kotlinhw4.models.IPost
import ru.puchkova.kotlinhw4.models.Post

open class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    // Все переменные должны быть инициализированй один раз,
    // иначе ты теряешь преимущества холдера.
    // findViewById - дорогая операция
    // тут мы, кстати, заменили ее синтетикаами котлина, которые под капотом дергают всю ту же
    // findViewById
    var author = itemView.author
    var date = itemView.date
    var likesCount = itemView.likesCount
    var shareCount = itemView.shareCount
    var commentCount = itemView.commentsCount
    var like = itemView.like

    fun bind(post: IPost) {

        author.text = post.author
        date.text = post.date
        likesCount.text = post.likeCount.toString()
        if (post.likeCount == 0)
            likesCount.visibility = View.GONE
        else
            likesCount.visibility = View.VISIBLE
        shareCount.text = post.repostCount.toString()
        if (post.repostCount == 0)
            shareCount.visibility = View.GONE
        else
            shareCount.visibility = View.VISIBLE
        commentCount.text = post.commentCount.toString()
        if (post.commentCount == 0)
            commentCount.visibility = View.GONE
        else
            commentCount.visibility = View.VISIBLE

        like.setOnClickListener {
            if (post.isLiked) {
                post.isLiked = false
                post.likeCount--
                likesCount.text = post.likeCount.toString()
            } else {
                post.isLiked = true
                post.likeCount++
                likesCount.text = post.likeCount.toString()
            }


            if (post.isLiked)
                like.setBackgroundResource(R.drawable.ic_like_true)
            else
                like.setBackgroundResource(R.drawable.ic_favorite)
        }
    }

}