package com.acm.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.acm.recyclerview.databinding.ActivityMainBinding
import com.acm.recyclerview.databinding.ItemFlowerBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        bind = ActivityMainBinding.inflate(layoutInflater)
        val view=bind.root
        setContentView(view)
        //val flowerList:ArrayList<String> = ArrayList<String>()
        val flowerList:ArrayList<Flower> = ArrayList()
        flowerList.add(Flower("HinnThar",3000,R.drawable.hinnthar))
        flowerList.add(Flower("Luckly",2000,R.drawable.lucky))
        flowerList.add(Flower("Lemor",2500,R.drawable.lemon))
        flowerList.add(Flower("Point",1500,R.drawable.point))
        //view model
        //val viewmodel:ViewModel= ViewModelProvider(this).get(ViewModel::class.java)

//        txtText.text=viewmodel.getC().toString()
//        btn.setOnClickListener {
//            viewmodel.setC()
//            txtText.text=viewmodel.getC().toString()
//        }
        //flowerList.add("Orchid")
       // flowerList.add("Gandhmar")
       // flowerList.add("Lili")
     //  bind.idRcyview.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)//row
      //  bind.idRcyview.layoutManager=GridLayoutManager(this,3)
        bind.idRcyview.layoutManager=LinearLayoutManager(this)
        bind.idRcyview.adapter=FlowerAdapter(flowerList)



    }
}