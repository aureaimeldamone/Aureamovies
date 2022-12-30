package com.dicoding.picodiploma.submission

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvBuku: RecyclerView
    private var list: ArrayList<Buku> = arrayListOf()
    private var title: String = "Daftar Buku"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvBuku = findViewById(R.id.rv_book)
        rvBuku.setHasFixedSize(true)

        list.addAll(BukuData.listData)
        showRecyclerList()
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun showRecyclerList() {
        rvBuku.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = CardViewBukuAdapter(list)
        rvBuku.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : CardViewBukuAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Buku) {
                showSelectedHero(data)
            }
        })
    }

    private fun showSelectedHero(buku: Buku) {
            val moveWithData = Intent(this@MainActivity, MoveWithData::class.java)
            moveWithData.putExtra(MoveWithData.EXTRA_JUDUL, buku.judul)
            moveWithData.putExtra(MoveWithData.EXTRA_PENULIS, buku.penulis)
            moveWithData.putExtra(MoveWithData.EXTRA_TAHUN, buku.tahunTerbit)
            moveWithData.putExtra(MoveWithData.EXTRA_PHOTO, buku.photo)
            moveWithData.putExtra(MoveWithData.EXTRA_RATING, buku.rating)
            moveWithData.putExtra(MoveWithData.EXTRA_GENRE, buku.genre)
            moveWithData.putExtra(MoveWithData.EXTRA_SINOPSIS, buku.sinopsis)
            moveWithData.putExtra(MoveWithData.EXTRA_HALAMAN, buku.halaman)
            moveWithData.putExtra(MoveWithData.EXTRA_TYPE, buku.type)

            startActivity(moveWithData)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "About"
                showAbout()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_dial_number -> {
                val phoneNumber = "087860952095"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }

            R.id.btn_message -> {
                val phoneNumber = "087860952095"
                val messageIntent = Intent(Intent.ACTION_VIEW, Uri.parse("sms:$phoneNumber"))
                messageIntent.putExtra("sms_body", "")
                startActivity(messageIntent)
            }

            R.id.btn_email -> {
                val email = "aarron_heldian_2rpl@student.smktelkom-mlg.id.id"
                val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$email"))
                startActivity(emailIntent)
            }
        }
    }

    private fun showAbout() {
        setContentView(R.layout.profile_layout_about)

        val btnDialPhone: ImageView = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)

        val btnMassage: ImageView = findViewById(R.id.btn_message)
        btnMassage.setOnClickListener(this)

        val btnEmail: ImageView = findViewById(R.id.btn_email)
        btnEmail.setOnClickListener(this)
    }

}