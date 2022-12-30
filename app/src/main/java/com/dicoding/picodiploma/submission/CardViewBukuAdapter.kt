package com.dicoding.picodiploma.submission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewBukuAdapter(private val listBuku: ArrayList<Buku>) : RecyclerView.Adapter<CardViewBukuAdapter.CardViewViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Buku)
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvJudul: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvPenulis: TextView = itemView.findViewById(R.id.tv_item_penulis)
        var tvTahunTerbit: TextView = itemView.findViewById(R.id.tv_item_tahun)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_cover)
        var tvRating: TextView = itemView.findViewById(R.id.tv_item_rating)
        var tvGenre: TextView = itemView.findViewById(R.id.tv_item_genre)
        var tvSinopsis: TextView = itemView.findViewById(R.id.tv_item_sinopsis)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBuku.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val (judul, penulis, tahunterbit, photo, rating, genre, sinopsis, halaman, type) = listBuku[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvJudul.text = judul
        holder.tvPenulis.text = penulis
        holder.tvTahunTerbit.text = tahunterbit
        holder.tvRating.text = rating
        holder.tvGenre.text = genre
        holder.tvSinopsis.text = sinopsis

        holder.itemView.setOnClickListener{onItemClickCallback.onItemClicked(listBuku[holder.adapterPosition])

        }
    }
}
