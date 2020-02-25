package ru.puchkova.kotlinhw4.models

interface IPost{

    val date: String
    val author: String
    val postBody: String?
    var likeCount: Int
    var commentCount: Int
    var repostCount: Int
    var isLiked: Boolean

    object PostType {
        val TEXT = 1
        val GEO = 2
        val VIDEO = 3
        val ADS = 4
    }

    fun getPostType(): Int
}