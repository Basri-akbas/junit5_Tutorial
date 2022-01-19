package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class J01_Assertions {
    @Test
    @DisplayName("ToAssert Testi")
    void testToAssert(){
        int actual="zekeriya".length();
        int beklenen=8;
        //assertEquals(8,actual);  // inline style:her zaman kullanilmaz tavsiye edilmez  manuel olarak girilmez.
        //assertEquals(beklenen,actual);
        assertEquals(actual,beklenen,"beklenen ve actual deger esit degil"); //message  hata durumunda print edilir.
                                            //  assertEquals pozitif testtir. expected ve actuel durumun esit olmasina bakar
        assertNotEquals(9,actual);  // assertNotEquals: negatif  test expected ve actuel durumun esit olmamasina bakar

        assertTrue(beklenen==actual);
        assertFalse(beklenen==7);

    }

    @Test
    @DisplayName("ConvertUpper Testi")
    void testConvertUpper() {
        String beklenen="ABDULLAH";
        String olusan="abdullah".toUpperCase();

        assertEquals(beklenen,olusan);
        assertTrue(beklenen.equals(olusan));
        beklenen="ABDULLAh";
        assertFalse(beklenen.equals(olusan));

        olusan=null;
        assertNull(olusan,"olusan deger null  degil");
        olusan="kursat";
        assertNotNull(olusan,"olusan deger null dur");

    }

    @Test
    @DisplayName("ToContaines test")
    void testToContaines(){
        boolean olusan="mustafa".contains("hi");
        boolean beklenen=false;

        assertEquals(olusan,beklenen,"string degeri barindirmaz");

    }


    @Test
    @DisplayName("arrays test")

    void testArray(){
        String str="javacanlara selam olsun ayaginiza das degmesin";
        String olusan[]=str.split(" ");

        String beklenen[]={"javacanlara","selam","olsun","ayaginiza","das","degmesin"};

         assertArrayEquals(beklenen,olusan,"arrayler farkli");

    }
}

