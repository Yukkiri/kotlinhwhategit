package ru.puchkova.kotlinhw4.models

data class AdsPost(
    override val date: String,
    override val author: String,
    override val postBody: String? = null,
    override var likeCount: Int,
    override var commentCount: Int,
    override var repostCount: Int,
    override var isLiked: Boolean
) : IPost {

    override fun getPostType() = IPost.PostType.ADS
}
