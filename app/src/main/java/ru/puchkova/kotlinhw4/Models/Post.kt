package ru.puchkova.kotlinhw4.models

import java.time.LocalDate
import java.time.format.DateTimeFormatter

data class Post(
    override val date: String,
    override val author: String,
    override val postBody: String? = null,
    override var likeCount: Int,
    override var commentCount: Int,
    override var repostCount: Int,
    override var isLiked: Boolean
) : IPost {

    override fun getPostType() = IPost.PostType.TEXT

    fun humanTime(date: String) {
        var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
        var ourDate = LocalDate.parse(date, formatter)
    }
}