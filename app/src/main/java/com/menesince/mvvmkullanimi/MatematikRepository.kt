package com.menesince.mvvmkullanimi

// Görevi -> Datasource yönetmek.(Fonksiyon çalıştır gibi)
class MatematikRepository {
    var mds = MatematikDataSource() // nesne oluştur
    suspend fun toplamaYap (alinanSayi1 :String, alinanSayi2: String) : String {
       return mds.toplamaYap(alinanSayi1 , alinanSayi2)

    }

    // tek satırlık kodlar bu şekilde de yazılabilir
    suspend fun carpmaYap (alinanSayi1 :String, alinanSayi2: String) : String = mds.carpmaYap(alinanSayi1, alinanSayi2)
}