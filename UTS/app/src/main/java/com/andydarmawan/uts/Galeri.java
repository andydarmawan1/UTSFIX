package com.andydarmawan.uts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Galeri extends AppCompatActivity implements GaleriAdapter.OnAdapterClickListener {
    GaleriClass galeri;
    RecyclerView recyclerView;
    private List<GaleriClass> galeris = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeri);

        recyclerView = findViewById(R.id.rv_galeri);
        galeris = new ArrayList<GaleriClass>();
        galeris = initData();
        GaleriAdapter adapter = new GaleriAdapter(galeris,this);
        adapter.setListener(this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapter);

    }

    public ArrayList<GaleriClass> initData(){
        ArrayList<GaleriClass> list = new ArrayList<>();
        list.add(new GaleriClass(1,"Jelajah Majapahir","",
                "Sebelum berdirinya Majapahit, Singhasari telah menjadi kerajaan paling kuat di Jawa. Hal ini menjadi perhatian Kubilai Khan, penguasa Dinasti Yuan di Tiongkok. Ia mengirim utusan yang bernama Meng Chi[13] ke Singhasari yang menuntut upeti. Kertanagara, penguasa kerajaan Singhasari yang terakhir menolak untuk membayar upeti dan mempermalukan utusan tersebut dengan merusak wajahnya dan memotong telinganya.[13][14] Kubilai Khan marah dan lalu memberangkatkan ekspedisi besar ke Jawa tahun 1293. \n" +
                        "Ketika itu, Jayakatwang, adipati Kediri, sudah menggulingkan dan membunuh Kertanegara. Atas saran Aria Wiraraja, Jayakatwang memberikan pengampunan kepada Raden Wijaya, menantu Kertanegara, yang datang menyerahkan diri. Kemudian, Wiraraja mengirim utusan ke Daha, yang membawa surat berisi pernyataan, Raden Wijaya menyerah dan ingin mengabdi kepada Jayakatwang.[15] Jawaban dari surat di atas disambut dengan senang hati.[15] Raden Wijaya kemudian diberi hutan Tarik. Ia membuka hutan itu dan membangun desa baru. Desa itu dinamai Majapahit, yang namanya diambil dari buah maja, dan rasa \"pahit\" dari buah tersebut. Ketika pasukan Mongol tiba, Wijaya bersekutu dengan pasukan Mongol untuk bertempur melawan Jayakatwang. Setelah berhasil menjatuhkan Jayakatwang, Raden Wijaya berbalik menyerang sekutu Mongolnya sehingga memaksa mereka menarik pulang kembali pasukannya secara kalang-kabut karena mereka berada di negeri asing.[16][17] Saat itu juga merupakan kesempatan terakhir mereka untuk menangkap angin muson agar dapat pulang, atau mereka terpaksa harus menunggu enam bulan lagi di pulau yang asing. \n" +
                        "Tanggal pasti yang digunakan sebagai tanggal kelahiran kerajaan Majapahit adalah hari penobatan Raden Wijaya sebagai raja, yaitu tanggal 15 bulan Kartika tahun 1215 saka yang bertepatan dengan tanggal 10 November 1293. Ia dinobatkan dengan nama resmi Kertarajasa Jayawardhana. Kerajaan ini menghadapi masalah. Beberapa orang tepercaya Kertarajasa, termasuk Ranggalawe, Sora, dan Nambi memberontak melawannya, meskipun pemberontakan tersebut tidak berhasil. Pemberontakan Ranggalawe ini didukung oleh Panji Mahajaya, Ra Arya Sidi, Ra Jaran Waha, Ra Lintang, Ra Tosan, Ra Gelatik, dan Ra Tati. Semua ini tersebut disebutkan dalam Pararaton.[18] Slamet Muljana menduga bahwa mahapatih Halayudha lah yang melakukan konspirasi untuk menjatuhkan semua orang tepercaya raja, agar ia dapat mencapai posisi tertinggi dalam pemerintahan. Namun setelah kematian pemberontak terakhir (Kuti), Halayudha ditangkap dan dipenjara, dan lalu dihukum mati.[17] Wijaya meninggal dunia pada tahun 1309. \n" +
                        "Putra dan penerus Wijaya adalah Jayanegara. Pararaton menyebutnya Kala Gemet, yang berarti \"penjahat lemah\". Kira-kira pada suatu waktu dalam kurun pemerintahan Jayanegara, seorang pendeta Italia, Odorico da Pordenone mengunjungi keraton Majapahit di Jawa. Pada tahun 1328, Jayanegara dibunuh oleh tabibnya, Tanca. Ibu tirinya yaitu Gayatri Rajapatni seharusnya menggantikannya, akan tetapi Rajapatni memilih mengundurkan diri dari istana dan menjadi bhiksuni. Rajapatni menunjuk anak perempuannya Tribhuwana Wijayatunggadewi untuk menjadi ratu Majapahit. Pada tahun 1336, Tribhuwana menunjuk Gajah Mada sebagai Mahapatih, pada saat pelantikannya Gajah Mada mengucapkan Sumpah Palapa yang menunjukkan rencananya untuk melebarkan kekuasaan Majapahit dan membangun sebuah kemaharajaan. Selama kekuasaan Tribhuwana, kerajaan Majapahit berkembang menjadi lebih besar dan terkenal di kepulauan Nusantara. Tribhuwana berkuasa di Majapahit sampai kematian ibunya pada tahun 1350. Ia diteruskan oleh putranya, Hayam Wuruk. "));
        list.add(new GaleriClass(2,"Jelajah Kerajaan Sriwijaya","",
                "Kerajaan Sriwijaya merupakan salah satu kerajaan besar yang ada di nusantara. Kerajaan yang dikenal dengan kekuatan maritimnya tersebut berhasil menguasai pulau Sumatra, Jawa, Pesisir Kalimantan, Kamboja, Thailand Selatan, dan Semenanjung Malaya yang kemudian menjadikan Kerajaan Sriwijaya sebagai kerajaan yang berhasil menguasai perdagangan di Asia-tenggara pada masa itu.\n" +
                        "\n" +
                        "Kata 'Sriwijaya' berasal dari dua suku kata yaitu 'Sri' yang berarti bercahaya atau gemilang dan 'Wijaya' yang berarti kemenangan. Jadi Sriwijaya berarti kemenangan yang gemilang. Sriwijaya juga disebut dengan berbagai macam nama. Orang Tionghoa menyebut Shih-li-fo-shih atau San-fo-ts’i atau San Fo Qi. Dalam bahasa Sansekerta dan Pali kerajaan Sriwijaya disebut Yavadesh dan Javadeh. Bangsa Arab menyebut Zabaj atau Sribuza dan Khmer menyebut Malayu. Sementara dari peta Ptolemaeus ditemukan keterangan tentang ada 3 pulau Sabadeibei yang berkaitan dengan Sriwijaya."));

        return list;
    }

    @Override
    public void DetailonClick(GaleriClass galeriClass) {
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("id",galeriClass.getId());
        intent.putExtra("nama",galeriClass.getName());
        intent.putExtra("photo",galeriClass.getPhoto());
        intent.putExtra("isi",galeriClass.getIsi());

        startActivity(intent);
    }
}
