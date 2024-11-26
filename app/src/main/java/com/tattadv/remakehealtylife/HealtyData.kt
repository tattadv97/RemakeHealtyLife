package com.tattadv.remakehealtylife

//Object = Singleton di Kotlin, basically buat static data
object HealtyData {

    //Data statis buat list healty lifestyle tips
    private val healtyNames = arrayOf(
        "Check Up",
        "Mencuci Tangan",
        "Kebersihan Diri",
        "Keran Air",
        "Makan Buah",
        "Makan Sayur",
        "Tidak Merokok",
        "Olahraga",
        "Tidak Stress",
        "Tidur Cukup"
    )

    private val healtyDetails = arrayOf(
        "Selama hidup hingga sekarang ini, sudah berapa kali Anda melakukan pemeriksaan kesehatan atau medical check up? Jika rutin dilakukan setidaknya sekali setiap tahun, berarti Anda tergolong sebagai orang yang peduli dengan kondisi kesehatan. Sebaliknya, jika pemeriksaan kesehatan ini dilakukan dalam jeda waktu yang terlampau lama, bahkan tidak pernah sama sekali, mungkin tanpa disadari Anda tengah diancam oleh berbagai risiko serangan penyakit. Makin dini suatu penyakit terdeteksi, maka makin cepat pertolongan yang dapat diberikan. Dengan begini, penyakit tidak berlanjut ke tahap yang lebih serius, sekaligus mencegah pertolongan yang lebih rumit. Medical check-up diperlukan oleh perempuan dan laki-laki, baik anak muda maupun orang lanjut usia.",
        "Mencuci tangan atau disebut juga bisuh adalah salah satu tindakan sanitasi dengan membersihkan tangan dan jari jemari dengan menggunakan air ataupun cairan lainnya oleh manusia dengan tujuan untuk menjadi bersih, sebagai bagian dari ritual keagamaan, ataupun tujuan-tujuan lainnya. Mencuci tangan adalah salah satu tindakan sanitasi dengan membersihkan tangan dan jari jemari dengan menggunakan air ataupun cairan lainnya oleh manusia dengan tujuan untuk menjadi bersih, sebagai bagian dari ritual keagamaan, ataupun tujuan-tujuan lainnya. Sebagian besar infeksi bisa terjadi karena Anda menyentuh makanan atau mulut dengan kondisi tangan yang kotor. Oleh karena itu, mencuci tangan dengan sabun adalah salah satu cara menjaga kebersihan diri yang bisa Anda lakukan untuk menghindari infeksi penyakit. Anda dianjurkan untuk mencuci tangan dengan sabun dan air mengalir, terutama pada saat berikut : Usai menggunakan toilet, Sebelum dan sesudah makan, Setelah memegang hewan, Berada disekitar yang rentan batuk dan pilek",
        "Aktivitas mencuci tangan, mandi, sikat gigi dan lainnya adalah hal yang sering Anda lakukan. Anda juga pasti tahu bahwa hal tersebut dilakukan untuk menjaga kebersihan diri. Sayangnya, tidak semua orang tahu tentang cara menjaga kebersihan diri dengan benar, termasuk alasan kenapa mereka harus menjaga kebersihan diri selain memang sudah menjadi rutinitas. Kenali panduan tepat cara membersihkan diri, yuk! Kebersihan diri Sebagai kebersihan diri atau individu yang ditetapkan tabiat penjagaan badanyang semua orang amalan untuk mencegah penyakit dan kekal sihat. Antaranya kita boleh menyebutkan kebersihan mulut, mencuci tangan, membersihkan mata, telinga, muka, rambut, kawasan kemaluan dan kaki, serta pemotongan kuku secara berkala. Kebersihan diri atau personal hygiene adalah tindakan untuk memelihara kebersihan dan kesehatan seseorang untuk memperoleh kesejahteraan fisik dan psikis yang optimal. Kebersihan diri atau personal hygiene adalah tindakan untuk memelihara kebersihan dan kesehatan seseorang untuk memperoleh kesejahteraan fisik dan psikis yang optimal. Menjaga kebersihan diri perlu dilakukan karena tiga alasan, yaitu : Alasan sosial.",
        "Keran air adalah benda yang sangat penting dalam kehidupan sehari-hari. Tidak hanya berfungsi untuk mengalirkan atau menghentikan aliran air, keran memiliki banyak sekali variasi. Dengan memilih keran air yang tepat, kegiatan mencuci atau mandi pun jadi lebih nyaman. Kran yaitu alat yang dipakai untuk mengeluarkan air dari selang atau sistem instalasi air. Karena meski ukurannya hanya kecil saja, namun kran menjadi salah satu element penting dalam rumah atau bangunan. Sebab segala jenis urusan yang berhubungan dengan air hampir semuanya selalu membutuhkan alat ini. Keberadaan kran sama pentingnya dengan selang atau pipa yang dipakai untuk mengalirkan air tersebut.",
        "Definisi atau pengertian buah-buahan secara umum adalah salah satu bagian dari tanaman atau pohon yang berdaging dan dapat dimakan sebagai makanan yang bisa memberikan efek mengenyangkan, menyehatkan dan menyenangkan (sebagai camilan). Manfaat buah untuk kesehatan tubuh sangat beragam. Selain untuk memelihara kesehatan, kandungan nutrisi pada buah juga bermanfaat untuk melindungi tubuh dari penyakit bahkan dapat membantu proses penyembuhan penyakit. Umumnya, semua buah mengandung nutrisi yang diperlukan tubuh. Nutrisi yang terkandung di dalamnya membuat manfaat buah untuk kesehatan tidak diragukan lagi. Kandungan nutrisinya menjaga tubuh tetap sehat, juga melindungi tubuh dari kerusakan akibat zat kimia yang masuk dan menyebabkan gangguan.",
        "Sayur adalah makanan yang menjadi momok bagi seseorang yang tidak menyukainya terutama bagi anak-anak. Sayur sangat dibutuhkan pada tubuh karena di dalam sayur terdapat banyak sumber vitamin dan mineral yang sangat membantu untuk proses pertumbuhan anak. Pada anak usia sekolah anak ia lebih suka makan makanan yang hanya ia sukai atau makanan favoritnya yang tidak sesuai dengan kebutuhan tubunhya. Disinilah peran orang tua yang sangat dibutuhkan oleh anak karena orang tua merupakan orang yang sangat berpengaruh pada proses pertumbuhan anak. Tanpa adanya dukungan atau dorongan dari orang tua untuk meningkatkan kualitas makan anak maka, pada akhirnya anak tidak terbiasa dan menjadi anti pada sayur tersebut. Sayuran merupakan sebutan umum bagi bahan pangan asal tumbuhan yang biasanya mengandung kadar air tinggi dan dikonsumsi dalam keadaan segar atau setelah diolah secara minimal. Sebutan untuk beraneka jenis sayuran disebut sebagai sayur-sayuran atau sayur-mayur. Sayur merupakan makanan yang sehat untuk dikonsumsi.",
        "Mari hidup sehat tanpa rokok agar kita lebih sehat. Banyak orang yang ingin berhenti merokok namun hanya sebagian saja yang melakukannya dengan sungguh-sungguh. Berhenti merokok memang sulit sekali dilakukan bagi yang sudah kecanduan, tapi bukan berarti tidak bisa. Rokok mengandung 4000 bahan kimia, 200 diantaranya beracun dan 43 penyebab kanker. Racun utama pada rokok adalah Nikotin, Tar dan Karbon Monoksida (CO). Nikotin adalah zat adiktif (menimbulkan kekambuhan) yang mempengaruhi syaraf dan peredaran darah. Zat ini mampu memicu kanker paru-paru yang mematikan. Tar adalah substansi hidrokarbon yang bersifat lengket dan menempel pada paru-paru. Karbon monoksida adalah zat yang mengikat hemoglobin dalam darah, membuat darah tidak mampu mengikat oksigen. Masih banyak terdapat cara-cara lain yang bisa ditempuh untuk berhenti merokok. Remaja juga bisa memilih waktu yang tepat untuk mulai berhenti. Anda boleh memilih hari atau tanggal tertentu yang bermakna dalam hidup anda, misalnya hari ulang tahun, tahun baru, atau hari-hari lain, seperti bulan Ramadhan, Galungan atau hari-hari besar lainnya.",
        "Olahraga juga bisa diartikan sebagai aktivitas yang melibatkan fisik dan keterampilan dari individu atau tim, dilakukan untuk hiburan. Ada banyak jenis aktivitas fisik dalam olahraga, termasuk berenang, berlari, berjalan, menari, dan lainnya. Menjadi aktif telah terbukti memiliki banyak manfaat untuk kesehatan, baik secara fisik maupun mental. Menurut Kamus Besar Bahasa Indonesia (KBBI), olahraga adalah gerak badan untuk menguatkan dan menyehatkan tubuh, seperti contohnya sepak bola, berenang, dan lempar lembing. Olahraga juga bisa diartikan sebagai aktivitas yang melibatkan fisik dan keterampilan dari individu atau tim, dilakukan untuk hiburan. Olahraga dapat diartikan sebagai suatu kegiatan menggerakan seluruh atau sebagian tubuh baik untuk kesehatan maupun hiburan. Olahraga juga sering diartikan sebagai suatu aktivitas yang melibatkan pengerahan tenaga fisik dan pikiran untuk melatih tubuh manusia baik secara jasmani maupun rohani. Kombinasi diet, olahraga dan tidur merupakan kunci yang penting untuk kesehatan total. Oleh karena itulah olahraga sangat digemari banyak orang. Dengan berolahraga rutin, secara tidak langsung tubuh juga akan memiliki kondisi yang lebih prima serta ideal dibandingkan sebelumnya. Pikiran jauh lebih tenang, dan diri menjadi jauh lebih produktif. Olahraga biasanya diatur oleh seperangkat aturan atau kebiasaan, yang berfungsi untuk memastikan persaingan yang adil, dan memungkinkan ajudikasi pemenang yang konsisten. Olahraga memiliki fungsi yang sangat beragam bagi tubuh kita, diantaranya yaitu membuat tubuh kita menjadi lebih sehat tentunya.",
        "Ardani (2007) mendefinisikan stress merupakan suatu keadaan tertekan baik itu secara fisik maupun psikologis. Menurut Richard (2010) stres adalah suatu proses yang menilai suatu peristiwa sebagai sesuatu yang mengancam, ataupun membahayakan dan individu merespon peristiwa itu pada level fisiologis, emosional, kognitif dan perilaku. Stres adalah gangguan mental yang dihadapi seseorang akibat adanya tekanan. Tekanan ini muncul dari kegagalan individu dalam memenuhi kebutuhan atau keinginannya. Tekanan ini bisa berasal dari dalam diri, atau dari luar. Stres tidak selalu buruk, walaupun biasanya dibahas dalam konteks negatif, karena stres memiliki nilai positif ketika menjadi peluang saat menawarkan potensi hasil. Sebagai contoh, banyak profesional memandang tekanan berupa beban kerja yang berat dan tenggat waktu yang mepet sebagai tantangan positif yang menaikkan mutu pekerjaan mereka dan kepuasan yang mereka dapatkan dari pekerjaan mereka.",
        "Tidur cukup merupakan bagian dari pola tidur yang baik. Lamanya waktu tidur setiap orang bisa berbeda-beda, sesuai usia dan kondisi kesehatan. Orang dewasa sehat membutuhkan tidur selama tujuh sampai sembilan jam setiap malam. Sedangkan orang di atas usia 65 tahun membutuh tidur sebanyak tujuh sampai delapan jam setiap malam. Kebutuhan seseorang dewasa untuk tidur adalah 7-8 jam setiap hari. Waktu tidur terbaik adalah dimalam hari dengan rekomendasi antara jam 09:00 malam hingga jam 04:00 pagi.Kurang istirahat akan mempengaruhi 771 expresi gen kita, yang akan mempengaruhi keseimbangan sistem tubuh. Penyakit kanker, jantung, stroke, radang sendi,  auto-immune, dan depresi bisa terjadi karena kurang istirahat."
    )

    private val healtyImages = intArrayOf(
        R.drawable.cek_up,
        R.drawable.cuci_tangan,
        R.drawable.kebersihan_diri,
        R.drawable.keran_air,
        R.drawable.makan_buah,
        R.drawable.makan_sayur,
        R.drawable.no_smoking,
        R.drawable.olahraga,
        R.drawable.tidak_stress,
        R.drawable.tidur_cukup
    )

    //Function buat generate list of Healty Objects
    fun getListData(): ArrayList<Healty> =
        ArrayList<Healty>().apply {
            for (i in healtyNames.indices) {
                add(Healty(
                    name = healtyNames[i],
                    detail = healtyDetails[i],
                    photo = healtyImages[i]
                ))
            }
        }
}