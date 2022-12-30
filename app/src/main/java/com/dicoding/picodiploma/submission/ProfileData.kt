package com.dicoding.picodiploma.submission

import java.util.ArrayList

object ProfileData {
    private var data = arrayOf(
        arrayOf(
            "Aarron Heldian",
            "Aarron Heldian Darmawan",
            "Malang, 2 April 2003",
            "Pelajar/Mahasiswa",
            "-",
            "aarron_hedlian_27rpl@student.smktelkom-mlg.sch.id",
            "Keinginan saya saat ini mendapatkan kelas Menjadi Android Developer Expert (MADE) dan ingin bisa terus berkembang dalam belajar menjadi android developer."
        ),
        arrayOf(
            "Raditya Dika",
            "Dika Angkasaputra Moerwani Nasution",
            "Jakarta, 28 Desember 1984",
            "Penulis, Komedian, Aktor, Sutradara, Youtuber",
            "2004 - sekarang",
            "-",
            "seorang penulis, komedian, sutradara, dan aktor. Buku pertamanya berjudul Kambing Jantan masuk kategori best seller. Buku tersebut menampilkan kehidupan Dika (Raditya Dika) saat kuliah di Australia. Tulisan pria yang akrab disebut Raditya Dika itu bisa digolongkan sebagai genre baru. Kala ia merilis buku pertamanya tersebut, memang belum banyak yang masuk ke dunia tulisan komedi. Apalagi bergaya diari pribadi (personal essay)."
        )
    )
    val listProfile: ArrayList<Profile>
        get() {
            val listPerson = ArrayList<Profile>()
            for (aData in data) {
                val profile = Profile()
                profile.nickName = aData[0]
                profile.name = aData[1]
                profile.lahir = aData[2]
                profile.pekerjaan = aData[3]
                profile.tahunAktif = aData[4]
                profile.email = aData[5]
                profile.content = aData[6]

                listPerson.add(profile)
            }
            return listPerson
        }
}
