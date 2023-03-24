package com.example.avengers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.avengers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var mList: ArrayList<DataItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)

        mList=  ArrayList()
        prepareData()

        val adapter = MainAdapter(mList)
        binding.recyclerView.adapter=adapter
    }

    private fun prepareData(){
        mList.add(
            DataItem("Captain Amerika : The First Avenger ",
                "Filmde, II. Dünya Savaşı sırasında, zayıf, ufak tefek ve çelimsiz bir adam olan Steve Rogers, süper asker Kaptan Amerika'ya dönüşür ve Kızıl Kafatası'nın Tesseract'ı dünya hakimiyeti için bir enerji kaynağı olarak kullanmasını engellemek zorundadır. Marvel'ın Captain America çizgi-romanına dayanır.",
                R.drawable.captain,null
            )
        )
        mList.add(
            DataItem("The Incredible Hulk",
                "Stan Lee ve Jack Kirby tarafından oluşturulmuştur. İlk defa The Incredible Hulk #1 (Mayıs 1962) adlı bölümde görülmüştür. İnanılmaz bir güce sahip olan bu yeşil dev, duygularını (öfkesini) kontrol edemez. Radyasyon kaynaklı mutasyon geçirmiştir.",
                R.drawable.hulk,null
            )
        )
        mList.add(
            DataItem("Doctor Strange",
                "Doctor Strange, Steve Ditko tarafından 1963'te tasarlanmış bir kurgusal karakter. Mistik büyü gücü, gerçekliğin kendisini değiştirme, zamanı bükme, uçabilme ve ışınlanabilme. Doctor Stephen Vincent Strange Ama çoğu kişi onu Doctor Strange olarak biliyor. İlk olarak Strange Tales #110'da görülmüştür.",
                R.drawable.doctor_strange,null
            )
        )
        mList.add(
            DataItem("Avengers End Game",
                "Avengers: Endgame, Marvel Comics'in İntikamcılar adlı süper kahraman grubundan uyarlanan ve Marvel Studios tarafından yapımı üstlenilen ABD süper kahraman filmi. 2018 yapımı Avengers: Sonsuzluk Savaşı filminin devamı niteliğinde olup yirmi ikinci Marvel Sinematik Evreni filmidir.",
                R.drawable.avengers_endgame,null
            )
        )
        mList.add(
            DataItem("Ironman 1",
                "Tony Stark, hem bir mühendislik dahisi hem de tam bir playboydur. Kendi ülkesinde teknoloji harikası füzeler ve silahlar üretmektedir. Afganistan'da yeni bir füzeyi tanıtırken esir düşer ve yaralanır. Onu kaçıranlar, kendileri için bir füze yapmasını isterler.",
                R.drawable.ironman1,null
            )
        )
        mList.add(
            DataItem("Ironman 2",
                "Konusu. Ivan Vanko adında rus bir adam babası ölüm döşeğinde iken babasının Stark'lardan intikam almasını istemesi üzerine bir silah üzerine çalışmaya başlar. Tony, dünyaya gizli kimliğini ilan ettiği için hükûmet tarafından demir adam zırhını devlete teslim etmesi için baskı görmektedir.",
                R.drawable.ironman2,null
            )
        )
        mList.add(
            DataItem("Thor",
                "Thor, İskandinav mitolojisinde en güçlü tanrılardan biridir. Gücü babası Odin tarafından teslim edilmiş iki sihirli nesneye dayanmaktadır. Bu nesnelerden biri Mjölnir'dir. \"Miyölnir\" diye okunur.",
                R.drawable.thor,null
            )
        )
    }
}