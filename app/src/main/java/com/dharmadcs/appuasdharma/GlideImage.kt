package com.dharmadcs.appuasdharma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide

class GlideImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide_image)
    }

    fun click(view: View){
        val imageView: ImageView =findViewById(R.id.gambar)
        val inputURL: EditText = findViewById(R.id.textURL)
        val buttonChange: Button =findViewById(R.id.btnchange)

        val url = inputURL.text.toString()

        Glide.with(this)
            .load(url)
            .into(imageView)
    }
}