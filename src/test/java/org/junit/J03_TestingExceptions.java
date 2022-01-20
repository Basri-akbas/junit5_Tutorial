package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class J03_TestingExceptions {

        /*
    assertThrow() metodu --> belirtilen işlemin (executable) belirtilen türde bir Exception oluşturup oluşturmadığını
    test eder.
       Dolayısıyla 2 parametre alır.
       1. parametre --> expected(beklenen) Exception(istisna) türü,
       2. parametre --> actual(oluşacak)  çalıştırılacak olan işlemdir.
    Eğer işlem belirtilen türde bir exception oluşturursa test başarılı olur.TEST PASSED
    Ama exception oluşmaz ise veya türü yanlış olursa test başarısız olur.TEST FAILED
    TRİCKK : Exception.io türünde parent-child ilişkisi var ise yine test başarılı sayılır.
    */

    @Test
    @DisplayName("NumberFormatExpection Test")
    void testException01(){
        String strSayi="1453";
        String strSayi1="14l3";
        assertThrows(Exception.class,()->Integer.parseInt(strSayi)); //failed
        assertThrows(Exception.class,()->Integer.parseInt(strSayi1));  //passed
    }

    @Test
    @DisplayName("NullPointerExpection Test")
    void testException02(){
        String str=null;
        String str1="gokhan";
        assertThrows(NullPointerException.class,()->str.length()); //passed
        assertThrows(NullPointerException.class,()->str1.length());  //failed
    }

    @Test
    @DisplayName("IllegalArgumentExpection Test")
    void testException03(){
        assertThrows(IllegalArgumentException.class,()->yasYazdir(-2)); //passed
        assertThrows(IllegalArgumentException.class,()->yasYazdir(12)); //failed
    }

    void yasYazdir(int yas){
    if(yas<0){
        throw new IllegalArgumentException();
    }else{
        System.out.println(yas);
    }
    }

    @Test
    @DisplayName("ArithhmeticExpection Test")
    void testException04(){
        assertThrows(ArithmeticException.class,()->bol(5,0));  //passed
        assertThrows(ArithmeticException.class,()->bol(5,5));  //failed
    }

    int bol(int a,int b){
       return a/b;
    }





}