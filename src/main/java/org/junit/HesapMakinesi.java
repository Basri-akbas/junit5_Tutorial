package org.junit;

import java.util.stream.DoubleStream;

public class HesapMakinesi {


    static double carpma(double... sayi) {

        return DoubleStream.of(sayi).reduce(1,(t,u)->t*u);
    }

    static double topla(double... sayi) {

        return DoubleStream.of(sayi).sum();
    }
}
