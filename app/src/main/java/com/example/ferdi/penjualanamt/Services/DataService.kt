package com.example.ferdi.penjualanamt.Services

import com.example.ferdi.penjualanamt.Model.Product
import com.example.ferdi.penjualanamt.Model.TipeMobil

object DataService {

    val Mobil = listOf(
         TipeMobil("DAIHATSU", "mobil_daihatsu"),
         TipeMobil("ISUZU", "mobil_isuzu"),
         TipeMobil("TOYOTA", "mobil_toyota")
    )

    val Daihatsu = listOf(
            Product("Kampas Rem Xenia", "189000", "04465-bz170-001"),
            Product("Kopling Xenia", "200000", "31250-bz130-001"),
            Product("Dekrup Xenia", "150000", "31210-bz021-001")
    )

    val Isuzu = listOf(
            Product("Kopling Panther 2.5", "210000" ,"8-97562-183-a"),
            Product("Dekrup Panther 2.5", "130000", "8-94435-011-a"),
            Product("Filter Solar Panther", "22410", "6-13240-023-0")
    )

    val Toyota = listOf(
            Product("Kopling Dyna", "800000", "dbl12_07002"),
            Product("Dekrup Dyna", "750000", "dbl12_07000"),
            Product("Filter Udara Dyna", "50000","bhl10_01131"),
            Product("Kopling Dyna", "800000", "dbl12_07002"),
            Product("Dekrup Dyna", "750000", "dbl12_07000"),
            Product("Filter Udara Dyna", "50000","bhl10_01131"),
            Product("Kopling Dyna", "800000", "dbl12_07002"),
            Product("Dekrup Dyna", "750000", "dbl12_07000"),
            Product("Filter Udara Dyna", "50000","bhl10_01131"),
            Product("Kopling Dyna", "800000", "dbl12_07002"),
            Product("Dekrup Dyna", "750000", "dbl12_07000"),
            Product("Filter Udara Dyna", "50000","bhl10_01131")
    )

    val list_product = listOf<Product>()

    fun getProducts(mobil: String): List<Product>{
        return when(mobil){
            "DAIHATSU" -> Daihatsu
            "ISUZU" -> Isuzu
            "TOYOTA" -> Toyota
            else -> list_product
        }
    }


}