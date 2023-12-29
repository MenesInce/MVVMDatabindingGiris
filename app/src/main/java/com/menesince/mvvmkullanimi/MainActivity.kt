package com.menesince.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.menesince.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel : MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.mainActivityNesnesi = this

        viewModel.sonuc.observe(this){
            // it -> MainActivityViewModel içindeki sonucu temsil eder

            binding.hesaplamaSonucu = it
        }
        // binding.hesaplamaSonucu = viewModel.sonuc


    }
    fun buttonToplamaTikla (alinanSayi1 :String, alinanSayi2: String){

        viewModel.toplamaYap(alinanSayi1,alinanSayi2)
        // binding.hesaplamaSonucu  = viewModel.sonuc

    }
    fun buttonCarpmaTikla (alinanSayi1 :String, alinanSayi2: String){
        viewModel.carpmaYap(alinanSayi1,alinanSayi2)
        // binding.hesaplamaSonucu = viewModel.sonuc
    }
}