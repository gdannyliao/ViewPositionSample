package com.ggdsn.viewpositionsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        offsetLeftButton.setOnClickListener {
            imageView.offsetLeftAndRight(-10)
            refreshInfoView()
        }
        offsetRightButton.setOnClickListener {
            imageView.offsetLeftAndRight(10)
            refreshInfoView()
        }
        transXButton.setOnClickListener {
            imageView.translationX -= 10f
            refreshInfoView()
        }
        transYButton.setOnClickListener {
            imageView.translationX += 10f
            refreshInfoView()
        }
        scrollXButton.setOnClickListener {
            imageView.scrollX -= 10
            refreshInfoView()
        }
        scrollYButton.setOnClickListener {
            imageView.scrollX += 10
            refreshInfoView()
        }
        refreshInfoView()
    }

    private fun refreshInfoView() {
        window.decorView.post {
            val img = imageView
            infoTextView.text = "x=${img.x} y=${img.y} transX=${img.translationX} transY=${img.translationY}" +
                    "\nleft=${img.left} top=${img.top} right=${img.right} bottom=${img.bottom}" +
                    "\nscrollX=${img.scrollX} scrollY=${img.scrollY}"
        }
    }
}
