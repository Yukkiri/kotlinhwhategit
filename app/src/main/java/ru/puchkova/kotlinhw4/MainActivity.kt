package ru.puchkova.kotlinhw4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*
import ru.puchkova.kotlinhw4.models.AdsPost
import ru.puchkova.kotlinhw4.models.Post
import ru.puchkova.kotlinhw4.models.VideoPost
import ru.puchkova.kotlinhw4.Adapter.MediaPostAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val posts = listOf(

            VideoPost(
                "http://video.ch9.ms/ch9/507d/71f4ef0f-3b81-4d2c-956f-c56c81f9507d/AndroidEmulatorWithMacEmulator.mp4",
                "13 september 2019",
                "Netology",
                "Some text here\nHas no idea what i should write\nJust testing my code",
                9,
                0,
                1,
                false
            ),

            AdsPost(
                "15 september 2019", "Netology", "Otters are cute",
                0, 0, 2, false
            ),

            Post(
                "16 september 2019",
                "Netology",
                "But raccoons are cuter\nThe most cutest creatures in the whole world",
                99,
                0,
                5,
                false
            ),

            Post(
                "20 october 2019", "Netology", "And stupid\nofc, how can i forgot",
                150, 10, 3, false
            ),

            Post(
                "31 december 2019", "Netology", "Happy New Year!\nGood luck!",
                1393, 255, 100, false
            ),

            Post(
                "1 january 2020",
                "Netology",
                "So much food was a mistake\nFeeling too bad\nHlp m pls",
                1800,
                1010,
                99,
                false
            ),

            Post(
                "10 january 2020",
                "Netology",
                "Idk what to write\nLook at my horse\nMy horse is amazing",
                3,
                40,
                0,
                false
            ),

            Post(
                "15 january 2020", "Netology", "The most\nUseless\nWay\nto waste\nmy time\nOMG",
                33, 1, 0, false
            ),

            Post(
                "16 january 2020", "Netology", "Just a joke, relax",
                20, 0, 0, false
            )
        )

        postList.layoutManager = LinearLayoutManager(this)


        val adapter = MediaPostAdapter(posts)

        postList.adapter = adapter
    }


}
