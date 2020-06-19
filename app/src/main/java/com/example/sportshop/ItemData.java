package com.example.sportshop;

import java.util.ArrayList;

public class ItemData {
    private static String[] itemNames = {
            "Jersey",
            "Sepatu Futsal",
            "Kaus Kaki",
            "SmartBand",
            "Kacamata Renang",
            "Raket",
            "Bola Sepak",
            "Shuttle Cock",
            "Sarung Kiper",
            "Knee pad",
            "Jaring net"
    };

    private static String[] itemUlasan = {
            " - Barangnya bagus \n - kualitasnya mapan, sukak deh",
            " - mantap, cepat kali datangnya ini barang",
            " - Tebal, tidak mudah bau",
            " - Mantul, bisa jadi makin trendy nih gue olahraga",
            " - Sip",
            " - Raketnya nyaman, ringan, senarnya juga udah yang BG 66",
            " - ALhamdulillah bisa main bola lagi deh, oteweh lapangan",
            " - Koknya murah banget, tapi bukan murahan kok, seneng banget akhirnya bisa main bulutangkis lagi",
            " - Mantap bang",
            " - Sipp, barang sesuai dengan iklan",
            "Belum ada ulasan"
    };

    private static String[] itemDetails = {
            "Setelan Futsal Bahan Drifit Lokal/Wafer\n" +
                    "Ready stock uk S, M, L\n" +
                    "\n" +
                    "S : Pjg (59) Lbr (37)\n" +
                    "M : Pjg (62) Lbr (42)\n" +
                    "L : Pjg (64) Lbr (45,5)\n" +
                    "Toleransi +-2/3cm\n" +
                    "\n" +
                    "Mohon cantumkan Ukuran baju saat order.\n" +
                    "**Serta tanyakan stock terlebih dahulu**",
            "~~NEW ARRIVAL SUMMER 2019~~\n" +
                    "NIKE PHANTOM VENOM CLUB IC - Under the Radar Pack\n" +
                    "Warna: BLACK/VOLT NOIR\n" +
                    "Jenis Lapangan: Karpet / Karet / Indoor\n" +
                    "Art#AO0578007\n" +
                    "Tipe: CLUB LEVEL\n" +
                    "Ready Size:\n" +
                    "- 40\n" +
                    "- 41\n" +
                    "- 42.5\n" +
                    "100% Original\n" +
                    "Made In Vietnam",
            "KAUS KAKI FUTSAL/SOCCER EVOLIND\n" +
                    "GENESIS SERIES\n" +
                    "\n" +
                    "Tersedia 3 Varian warna:\n" +
                    "-Hitam\n" +
                    "-Biru\n" +
                    "-Merah Maroon\n" +
                    "\n" +
                    "Bahan:\n" +
                    "Cotton 35%\n" +
                    "Spandex 20%\n" +
                    "Nylon 35%\n" +
                    "Elastic 10%",
            "DIJAMIN ORIGINAL XIAOMI MI BAND 4 !!!\n" +
                    "READY WARNA BLACK SAJA\n" +
                    "\n" +
                    "Spesification:\n" +
                    "Weight: 22.1g\n" +
                    "Water resistance: 5ATM, up to 50m\n" +
                    "Screen Size: 0.95\"\n" +
                    "Resolution: 120x240 RGB\n" +
                    "Color Depth: 24 bit\n" +
                    "Bluetooth: BT5.0 BLE\n" +
                    "Sensors: 3-axis accelerometer + 3-axis gyroscope;PPG heart rate sensor; Capacitive proximity sensor\n" +
                    "Battery: LiPo 135mAh",
            "Kacamata Renang Speedo SF988 + Hard Case + Earplug (Tutup Kuping)\n" +
                    "\n" +
                    "Tipe : SF988\n" +
                    "Bahan tali karet, bagian tengah juga karet, lentur, tidak bisa patah, dan bisa di atur ukurannya.\n" +
                    "Bisa digunakan untuk Anak dan Dewasa.Isi paket :\n" +
                    "- 1 bh Kacamata renang\n" +
                    "- 1 bh Kotak (Hard Case)\n" +
                    "- 2 bh Earplug (Tutup Kuping)",
            "Raket Yonex GR 303 Original.\n" +
                    "..ringan dan nyaman di gunakan, sangat cocok untuk pemula dan anak2 sekolah, Murah dan bagus\n" +
                    "Senar raket sudah terpasang bisa langsung main... Dan sudah dapat pembungkusnya\n" +
                    "ayo buruan diorder....sebelum kehabisan...",
            "Bola Sepak Adidas Jahit IMPORT PREMIUM QUALITY\n" +
                    "\n" +
                    "Bola sepak adidas dengan kualitas yang sangat baik.\n" +
                    "Bola dijahit bukan bola tempel\n" +
                    "\n" +
                    "Bola Size 5\n" +
                    "\n" +
                    "Tersedia Warna:\n" +
                    "-Biru\n" +
                    "-Merah Muda\n" +
                    "-Mix Color",
            "Kok murah meriah untuk anak\n" +
                    "Harga untuk 1 slop ( isi 12 kok)\n" +
                    "Beli bnyk lbh murah",
            "GK GLOVE - NIKE GK GRIP 3 - New Lights Pack\n" +
                    "Warna: Blue Hero/White\n"+
                    "Ready Size: 6,8, 9,\n" +
                    "Art#GS3381486\n" +
                    "100% Original\n" +
                    "Type: TOP LEVEL GK GLOVE",
            "Type : 7718\n" +
                    "Warna : GREEN\n" +
                    "# Harga adalah harga satuan (1Pcs)\n" +
                    "# Untuk Sepasang silahkan order 2 Pcs\n" +
                    "\n" +
                    "Stock Ready\n" +
                    "Ukuran:\n" +
                    "- M ( lingkar lutut 35-41 cm ) -(Kosong)\n" +
                    "- L ( lingkar lutut 42-47 cm )\n" +
                    "- XL ( lingkar lutut 48-55 cm )\n" +
                    "# Mohon info ukuran pesanan\n" +
                    "\n" +
                    "Aolikes Knee Compression Pad Berbahan Nylon cocok untuk olahraga lari, sepeda,basket, volley, fitness dsb",
            "Jaring yang berfungsi untuk menengahi antara area dua pemain yang berlawanan" +
                    "Net badminton /bulutangkis gto murah\n" +
                    "\n" +
                    "Panjang dan lebar sesuai standar lapangan bulutangkis."
    };

    private static int[] itemImages = {
            R.drawable.jersey,
            R.drawable.shoes,
            R.drawable.kaoskai,
            R.drawable.smartband,
            R.drawable.kacamata,
            R.drawable.raket,
            R.drawable.bola,
            R.drawable.kok,
            R.drawable.kiper,
            R.drawable.kneepad,
            R.drawable.net
    };

    private static String[] itemPrice = {
            "Rp. 70.000",
            "Rp. 300.000",
            "Rp. 10.000",
            "Rp. 350.000",
            "Rp. 70.000",
            "Rp. 250.000",
            "Rp. 200.000",
            "Rp. 1.000",
            "Rp. 170.000",
            "Rp. 50.000",
            "Rp. 80.000"
    };

    static ArrayList<Item> getListData(){
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < itemNames.length; i++) {
            Item item = new Item();
            item.setNameItem(itemNames[i]);
            item.setDetailItem(itemDetails[i]);
            item.setPhotoItem(itemImages[i]);
            item.setPriceItem(itemPrice[i]);
            item.setUlasanItem(itemUlasan[i]);
            list.add(item);
        }
        return list;
    }
}
