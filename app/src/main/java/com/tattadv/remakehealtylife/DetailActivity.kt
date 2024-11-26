package com.tattadv.remakehealtylife

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    //Companion object = static di Java
    companion object {
        //        const val EXTRA_NAME = "extra_name"
//        const val EXTRA_DETAIL = "extra_detail"
//        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_HEALTY = "extra_healty"
    }

//    //Properties pake lazy initialization
//    private val imageView by lazy { findViewById<ImageView>(R.id.img_item_photo) }
//    private val nameView by lazy { findViewById<TextView>(R.id.title) }
//    private val detailView by lazy { findViewById<TextView>(R.id.textDetail) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        //Setup button back di action bar
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        val healty = intent.getParcelableExtra<Healty>(EXTRA_HEALTY)

        if (healty != null) {
            findViewById<TextView>(R.id.title).text = healty.name
            findViewById<TextView>(R.id.textDetail).text = healty.detail
            findViewById<ImageView>(R.id.img_item_photo).setImageResource(healty.photo)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed() //Ini bakal trigger back button
        return true
    }
}