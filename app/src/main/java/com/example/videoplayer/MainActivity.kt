package com.example.videoplayer

import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var videoView : VideoView = findViewById(R.id.videoview)
        val mediaController : MediaController
        mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setVideoPath("Video_URL")
        videoView.start()
        videoView.setMediaController(mediaController)
    }
}