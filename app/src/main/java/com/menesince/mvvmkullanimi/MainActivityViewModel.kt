package com.menesince.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// () inheritance anlamına gelir yani kalıtım
// () olmaması interface anlamına gelir
class MainActivityViewModel : ViewModel() {

    var sonuc = MutableLiveData("0")
    var mRepo = MatematikRepository()

    // viewmodelde fonksiyonlar return ile tercih edilmez
    fun toplamaYap (alinanSayi1 :String, alinanSayi2: String){
        // arayüze yakın işlem olduğu için main
        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value = mRepo.toplamaYap(alinanSayi1 , alinanSayi2)
        }
    }
    fun carpmaYap (alinanSayi1 :String, alinanSayi2: String){

        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value = mRepo.carpmaYap(alinanSayi1 , alinanSayi2)

        }
    }
}