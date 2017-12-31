package com.quirogal.cursoandroidkotlin.parteuno.sesion1

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.VideoView

import com.quirogal.cursoandroidkotlin.parteuno.R

/**
 * Created by usuario on 6/24/2017.
 */

class ActivityVideo : AppCompatActivity() {

    private var videoView: VideoView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        videoView = findViewById(R.id.videoView) as VideoView

        val video = Uri.parse("https://storage.selectmedia.asia/branded_content/WeWork/WW_15.mp4")
        videoView?.setVideoURI(video)
        //videoView?.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.comercial);


        /*
        videoView?.setOnPreparedListener{object :MediaPlayer.OnPreparedListener{
            override fun onPrepared(mp: MediaPlayer?) {

                mp?.isLooping = true
                videoView?.start()
            }
        }}*/



        videoView?.setOnPreparedListener { mp ->
            mp.isLooping = true
            videoView?.start()
        }
    }
}
