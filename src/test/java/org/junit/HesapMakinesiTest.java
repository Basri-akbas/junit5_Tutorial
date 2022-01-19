package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HesapMakinesiTest {

    @Test
    @DisplayName("sayilari toplar")    //aciklama yapar bilgilendirme
    void topla() {
        assertEquals(3,HesapMakinesi.topla(1,2));
       // assertEquals(5,HesapMakinesi.topla(1,2));
    }

    @Test
    @DisplayName("sayilari carpar")
    void carpma() {
        assertAll(()->assertEquals(2.6,HesapMakinesi.carpma(2,1.3)),
                ()->assertEquals(4.8,HesapMakinesi.carpma(2,2.4)),
                ()->assertEquals(-2.7,HesapMakinesi.carpma(-3,0.9)),
                ()->assertEquals(-18,HesapMakinesi.carpma(3,-6))

        );

        //assertEquals(2.6,HesapMakinesi.carpma(2,1.3));
        //assertEquals(4.8,HesapMakinesi.carpma(2,2.4));
        //assertEquals(-2.7,HesapMakinesi.carpma(-3,0.9));
        //assertEquals(-18,HesapMakinesi.carpma(3,-6));

    }


}