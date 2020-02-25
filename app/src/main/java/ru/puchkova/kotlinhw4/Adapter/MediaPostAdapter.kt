package ru.puchkova.kotlinhw4.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.puchkova.kotlinhw4.adapter.holder.MediaPostHolder
import ru.puchkova.kotlinhw4.R
import ru.puchkova.kotlinhw4.adapter.holder.AdsPostHolder
import ru.puchkova.kotlinhw4.adapter.holder.GeoPostHolder
import ru.puchkova.kotlinhw4.adapter.holder.TextPostHolder
import ru.puchkova.kotlinhw4.models.*


class MediaPostAdapter(var posts: List<IPost>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            IPost.PostType.VIDEO -> MediaPostHolder(LayoutInflater.from(parent.context).inflate(
                R.layout.video_post,
                parent,
                false
            ))
            IPost.PostType.TEXT -> TextPostHolder(LayoutInflater.from(parent.context).inflate(
                R.layout.post_card,
                parent,
                false
            ))
            IPost.PostType.ADS -> AdsPostHolder(LayoutInflater.from(parent.context).inflate(
                R.layout.ads_post,
                parent,
                false
            ))
            IPost.PostType.GEO -> GeoPostHolder(LayoutInflater.from(parent.context).inflate(
                R.layout.geo_post,
                parent,
                false
            ))
            else -> throw IllegalArgumentException("ViewType $viewType is not supported!")
        }
    }

    override fun getItemViewType(position: Int) = posts[position].getPostType()

    override fun getItemCount() = posts.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val post = posts[position]
        val postType = post.getPostType()
        when (postType) {
            IPost.PostType.VIDEO -> (holder as MediaPostHolder).bindVideo(post as VideoPost)
            IPost.PostType.TEXT -> (holder as TextPostHolder).bindText(post)
            IPost.PostType.ADS -> (holder as AdsPostHolder).bindAds(post as AdsPost)
            IPost.PostType.GEO -> (holder as GeoPostHolder).bindGeo(post as GeoPost)
            else -> throw IllegalArgumentException("ViewType $postType is not supported!")
        }
    }
}