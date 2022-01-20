package org.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class J04_TestingParametirezed {
    //cisss asla tavsiye edilmez -->failed olan testten sonrasi calismaz.sonrasinda defect var mi yokmu gerisi bulunamaz
    @Test
    void uzunlukSifirdanbyk(){
        assertTrue("yildiz".length()>0);
        assertTrue("suleyman".length()>2);
        assertTrue("omer".length()>3);
        assertTrue("kursat".length()>4);
    }

    /*
    lenght() methodu ile asagıdaki sartlar için 0'dan buyuk deger return ettigini test ediniz.
    Sartlar : "yıldız" , "suleyman" , "omer" , "kursat"  --> bu datalar testi nasıl geçer
    */
    @ParameterizedTest
    @ValueSource(strings = {"yildiz","suleyman","omer","x","kursat"})
    void uzunlukSifirdanBykPrmtrl(String str){
        assertTrue(str.length()>2);
    }


    //coklu sart--> her parametre  elemani  KEY VALUE ikili ile test method unda run edilir
    @ParameterizedTest
    @CsvSource(value ={"yildiz,YILDIZ","suleyman,SULEYMAN","omer,OMER","kursat,KURSAT"} )
    void testBykHrfCevir(String beklenenBykhrf,String isim){
        assertEquals(beklenenBykhrf.toUpperCase(),isim);
    }




}
