package com.menesince.mvvmkullanimi

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MatematikDataSource {
    // suspend -> veritabanları ile daha performanslı çalışan fonk
    // aynı zamanda coroutine olduğu anlamına gelir

    // fonksiyonlar return ile gönderilebilir

    suspend fun toplamaYap (alinanSayi1 :String, alinanSayi2: String) : String =
        //  withContext(Dispatchers.IO) -> return edilecekse böyle kullanılır
        // veritabanları ile işlem yapılacaksa "Dispatchers.IO" kullanılır. Arayüze yaklaştıkça "main"kullanılır
        withContext(Dispatchers.IO) {
            val sayi1 = alinanSayi1.toInt()
            val sayi2 = alinanSayi2.toInt()

            val toplam = sayi1 + sayi2
           return@withContext toplam.toString()
        }
    suspend fun carpmaYap (alinanSayi1 :String, alinanSayi2: String) : String =
        withContext(Dispatchers.IO) {

            val sayi1 = alinanSayi1.toInt()
            val sayi2 = alinanSayi2.toInt()

            val carp = sayi1 * sayi2
           return@withContext carp.toString()
        }
}