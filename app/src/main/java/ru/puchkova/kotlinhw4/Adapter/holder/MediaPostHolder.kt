package ru.puchkova.kotlinhw4.adapter.holder

import android.net.Uri
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import kotlinx.android.synthetic.main.post_card.view.mainText
import kotlinx.android.synthetic.main.video_post.view.*
import ru.puchkova.kotlinhw4.models.VideoPost


class MediaPostHolder(itemView: View) : MainHolder(itemView){

    val mainText = itemView.mainText
    val video: VideoView = itemView.video

    fun bindVideo(post: VideoPost) {
        super.bind(post)
        mainText.text = post.postBody

        val controls = MediaController(itemView.context)
        controls.setAnchorView(video)
        video.setMediaController(controls)
        video.setVideoURI(Uri.parse(post.videoLink))
        video.start()
    }
}