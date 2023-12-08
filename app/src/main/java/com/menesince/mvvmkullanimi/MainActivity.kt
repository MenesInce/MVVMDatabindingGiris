package com.menesince.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.menesince.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mainActivityNesnesi = this
        binding.hesaplamaSonucu = "0"


    }
    fun buttonToplamaTikla (alinanSayi1 :String, alinanSayi2: String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val toplam = sayi1 + sayi2
        binding.hesaplamaSonucu  = toplam.toString()
    }
    fun buttonCarpmaTikla (alinanSayi1 :String, alinanSayi2: String){

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val carp = sayi1 * sayi2
        binding.hesaplamaSonucu = carp.toString()
    }
}