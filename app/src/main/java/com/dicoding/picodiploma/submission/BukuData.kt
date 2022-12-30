package com.dicoding.picodiploma.submission

import androidx.constraintlayout.solver.ArrayRow
import java.util.ArrayList

object BukuData {
    private var data = arrayOf(
        arrayOf(
            "Kambing Jantan: Sebuah Catatan Harian Pelajar Bodoh",
            "Raditya Dika",
            "2005",
            "4.2",
            "Novel",
            "235",
            "Komedi",
            "Kambing Jantan: Sebuah Catatan Harian Pelajar Bodoh adalah buku karya Raditya Dika yang diterbitkan pada tahun 2005. Buku ini berkonsep buku harian dan berisi 235 halaman, yang ditulis berdasarkan kejadian asli sang penulis saat ia kuliah di Adelaide, Australia. Buku ini pun sempat difilmkan pada tahun 2009 dengan bertitelkan Kambing Jantan: The Movie yang dibintangi Raditya sendiri, dan juga Herfiza Novianti.",
            "https://upload.wikimedia.org/wikipedia/id/1/1a/Kambing_Jantan_buku_2.jpg"
        ),
        arrayOf(
            "Cinta Brontosaurus",
            "Raditya Dika",
            "2006",
            "4.3",
            "Novel",
            "152",
            "Komedi",
            "Cinta Brontosaurus adalah buku karya Raditya Dika kedua yang diterbitkan pada tahun 2006. Berbeda dengan buku pertamanya, di buku kedua ini lebih berkonsep cerita sebagai sebuah cerita-cerita pendek, tidak sebagai sebuah buku harian. Buku ini berisi 152 halaman, yang dituliskan masih berdasarkan kejadian asli dari sang penulis.",
            "https://upload.wikimedia.org/wikipedia/id/a/ad/Cinta_Brontosaurus_2.jpg"
        ),
        arrayOf(
            "Radikus Makankakus: Bukan Binatang Biasa",
            "Raditya Dika",
            "2007",
            "4.3",
            "Novel",
            "232",
            "Komedi",
            "Radikus Makankakus adalah buku karya Raditya Dika ketiga yang diterbitkan pada tahun 2007. Masih berkonsepkan cerita komedi yang ditulis berdasarkan kisah sang penulis. Buku ini berisi 232 halaman.",
            "https://upload.wikimedia.org/wikipedia/id/4/40/Radikus_Makankakus_2.jpg"
        ),
        arrayOf(
            "Babi Ngesot: Datang Tak Diundang Pulang Tak Berkutang",
            "Raditya Dika",
            "2008",
            "4.2",
            "Novel",
            "240",
            "Komedi",
            "Babi Ngesot adalah buku karya Raditya Dika keempat yang diterbitkan pada tahun 2008. Berkonsepkan cerita komedi yang ditulis berdasarkan kisah sang penulis mengenai hal-hal misteri hingga per-plonco-an dari senior pada masa sekolah. Buku ini berisi 240 halaman.",
            "https://upload.wikimedia.org/wikipedia/id/6/6e/Babi_Ngesot_2.jpeg"
        ),
        arrayOf(
            "Marmut Merah Jambu",
            "Raditya Dika",
            "2010",
            "4.2",
            "Novel",
            "222",
            "Komedi",
            "Marmut Merah Jambu adalah buku karya Raditya Dika kelima yang diterbitkan pada tahun 2010. Masih berkonsepkan cerita komedi yang ditulis berdasarkan kisah sang penulis seperti dalam buku-buku sebelumnya. Garis besar buku ini menceritakan kisah asmara penulis mapun orang terdekatnya, termasuk saat menjalin kasih dengan penyanyi Indonesia, Sherina Munaf. Buku ini berisi 222 halaman.",
            "https://upload.wikimedia.org/wikipedia/id/2/2b/Marmut_Merah_Jambu.jpg"
        ),
        arrayOf(
            "Manusia Setengah Salmon",
            "Raditya Dika",
            "2011",
            "3.9",
            "Novel",
            "264",
            "Komedi",
            "Manusia Setengah Salmon adalah buku karya Raditya Dika keenam yang diterbitkan pada tahun 2011. Berkonsepkan cerita komedi yang ditulis berdasarkan kisah sang penulis seperti dalam buku-buku sebelumnya. Buku ini berisi 264 halaman.",
            "https://upload.wikimedia.org/wikipedia/id/2/2f/Manusia_Setengah_Salmon.jpg"
        ),
        arrayOf(
            "Koala Kumal",
            "Raditya Dika",
            "2016",
            "4.4",
            "Novel",
            "Komedi",
            "260",
            "Koala Kumal merupakan film komedi romantis Indonesia yang dirilis 5 Juli 2016. Film ini dibintangi oleh Raditya Dika dan Acha Septriasa, serta menjadi film debut bagi penyanyi Sheryl Sheinafia. Diadaptasi dari novel berjudul sama karya Raditya Dika. Film ini menjadi film Raditya Dika dengan jumlah artis cameo terbanyak hingga saat ini.",
            "https://upload.wikimedia.org/wikipedia/id/2/28/Koala_Kumal.jpg"
        ),
        arrayOf(
            "Ubur-Ubur Lembur",
            "Raditya Dika",
            "2018",
            "4.7",
            "Novel",
            "232",
            "Komedi",
            "Ubur-Ubur Lembur adalah buku kumpulan cerita karya Raditya Dika atau Radit yang diluncurkan secara serentak pada tanggal 7 Februari 2018. Buku ini menceritakan pengalaman Raditya Dika hidup dari apa yang dicintainya. Pada prakata buku tersebut, Radit menceritakan bahwa dari semua pekerjaan yang Ia jalani, menulis adalah pekerjaan yang paling Ia senangi. Tetapi, seiring dengan kesibukannya di dunia hiburan, menulis menjadi sebuah kemewahan tersendiri bagi Radit. Sampai suatu ketika Ia bertemu seorang komedian dari Australia di acara Ubud Writers and Readers Festival.",
            "https://upload.wikimedia.org/wikipedia/id/8/8f/Ubur-ubur-Lembur1.jpg"
        ),
        arrayOf(
            "KambingJantan: Sebuah Komik Pelajar Bodoh",
            "Raditya Dika",
            "2008",
            "3.6",
            "Komedi",
            "252",
            "Komik",
            "KambingJantan: Sebuah Komik Pelajar Bodoh adalah kumpulan cerita seorang pelajar Batak bernama Raditya Dika (dipanggil Dika, Radith, atau Kambing) ketika sedang menimba ilmu di Adelaide, Australia. Komik bergaya lebay ini diilustrasikan oleh si Komikus Muda: Dio Rudiman. Oya, satu hal lagi, komik ini juga multifungsi. Bisa digunakan sebagai pengganti tisu toilet.",
            "https://img20.jd.id/Indonesia/s800x800_/nHBfsgAACgAAABgALCI5pwAChYA.jpg"
        ),
        arrayOf(
            "Komik dari Twit-nya Raditya Dika",
            "Raditya Dika",
            "2008",
            "4.4",
            "Komedi",
            "130",
            "Komik",
            "Setelah sukses mengeluarkan Komik Kambing Jantan pada 2008 dan 2011, maka pada 2016 ini Raditya Dika kembali menerbitkan komik yang merupakan kolaborasi terbarunya bersama seorang komikus muda, Milfa Saadah.Cerita-cerita di dalam Komik dari Twit-nya Raditya Dika ini diangkat dari twit-twit Raditya Dika yang penuh lelucon dan kerap menuai komentar dari para followernya, mulai dari kiat untuk tetap tegar menghadapi mantan, hati yang selalu mengharapkan cinta, hingga tip gokil menghadapi ujian.Raditya Dika. Seorang pencerita dalam berbagai macam medium: buku, film, dan digital. Berawal sebagai blogger, karyanya telah terbit lebih dari 10 buku hingga saat ini. Dimulai dari KambingJantan, Cinta Brontosaurus, RadikusMakankakus, Babi Ngesot, Marmut Merah Jambu,Manusia Setengah Salmon, Koala Kumal hingga buku kolaborasi dengan komikus, Komik KambingJantan 1, Komik KambingJantan2, dan yang terbaru Komik dari Twit-nya Raditya Dika.Beberapa bukunya telah diangkat ke layar lebar dan ia pun pernah terlibat sebagai sutradara. Baik karya buku dan filmnya selalu ditunggu oleh penggemarnya dan termasuk bestselling.Milfa Saadah. Menggeluti hobi menggambar sejak kecil. Saat di bangku sekolah sering menjadi perwakilan lomba menggambar hingga tingkat provinsi. Memilih jurusan Multimedia di SMKN 1 Bangil, setelah itu ia melanjutkan kuliah di Seni Desain, Universitas Negeri Malang. Selain kesibukannya saat ini sebagai komikus, saat ini Milfa bekerja di salah satu perusahaan IT sebagai animator. Komik dari Twit-nya Raditya Dika adalah karya kolaboratif perdananya.",
            "https://mizanstore.com/admin718/assets/img/com_cart/produk/covGA001898.jpg"
        )
    )
    val listData: ArrayList<Buku>
        get() {
            val listBuku = ArrayList<Buku>()
            for (aData in data) {
                val buku = Buku()
                buku.judul = aData[0]
                buku.penulis = aData[1]
                buku.tahunTerbit = aData[2]
                buku.rating = aData[3]
                buku.genre = aData[4]
                buku.sinopsis = aData[7]
                buku.type = aData[6]
                buku.halaman = aData[5]
                buku.photo = aData[8]

                listBuku.add(buku)
            }
            return listBuku
        }
}
