package com.dicoding.picodiploma.submission

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MoveWithData : AppCompatActivity() {

    private var title: String = "Detail Buku"

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_detail)
        setActionBarTitle(title)

        val tvJudul: TextView = findViewById(R.id.tv_item_name)
        val tvPenulis: TextView = findViewById(R.id.tv_item_penulis)
        val tvTahunTerbit: TextView = findViewById(R.id.tv_item_tahun)
        val imgPhoto: ImageView = findViewById(R.id.img_item_cover)
        val tvRating: TextView = findViewById(R.id.tv_item_rating)
        val tvGenre: TextView = findViewById(R.id.tv_item_genre)
        val tvSinopsis: TextView = findViewById(R.id.tv_item_sinopsis)
        val tvHalaman: TextView = findViewById(R.id.tv_item_halaman)
        val tvType: TextView = findViewById(R.id.tv_item_type)

        val judul = intent.getStringExtra(EXTRA_JUDUL)
        val penulis = intent.getStringExtra(EXTRA_PENULIS)
        val tahun = intent.getStringExtra(EXTRA_TAHUN)
        val photo = intent.getStringExtra(EXTRA_PHOTO)
        val rating = intent.getStringExtra(EXTRA_RATING)
        val genre = intent.getStringExtra(EXTRA_GENRE)
        val sinopsis = intent.getStringExtra(EXTRA_SINOPSIS)
        val halaman = intent.getStringExtra(EXTRA_HALAMAN)
        val type = intent.getStringExtra(EXTRA_TYPE)

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(350, 550))
            .into(imgPhoto)

        tvJudul.text = judul
        tvPenulis.text = penulis
        tvTahunTerbit.text = tahun
        tvRating.text = rating
        tvGenre.text = genre
        tvSinopsis.text = sinopsis
        tvHalaman.text = halaman
        tvType.text = type

    }

    companion object{
        const val EXTRA_JUDUL = "extra_judul"
        const val EXTRA_PENULIS = "extra_penulis"
        const val EXTRA_TAHUN = "extra_tahun"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_RATING = "extra_rating"
        const val EXTRA_GENRE = "extra_genre"
        const val EXTRA_SINOPSIS = "extra_sinopsis"
        const val EXTRA_HALAMAN = "extra_halaman"
        const val EXTRA_TYPE = "extra_type"
    }
}
