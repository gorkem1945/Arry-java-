package com.arslaner.collection;

import java.util.Random;

public class Arrays {

    int[] nolar = new int[8];
    Random random = new Random();


    public void arryTanıt() {
        nolar[0] = 1408;
        nolar[1] = 1799;
        nolar[2] = 212;
        nolar[3] = 389;
        nolar[4] = 10;
        nolar[5] = 20;
        nolar[6] = 30;
        nolar[7] = 900;

    }

    public void arryForEach() {
        int i = 1;

        for (int eleman : nolar) {
            System.out.println("Dizinin " + i + ".elemanı " + eleman);
            i++;
        }

    }

    public void arryFor() {

        for (int i = 0; i <= 7; i++) {
            System.out.println("Dizinin " + (i + 1) + ".elemanı " + nolar[i]);

        }
    }

    public void dizidenIlkveSonElemaniOku() {
        System.out.println("Dizinin 1.elemanı " + nolar[0]);
        System.out.println("Dizinin 8.elemanı " + nolar[7]);

    }

    public void dizidenRasgeleUcElemanOku() {

        int usayi;

        for (int i = 1; i <= 3; i++) {
            usayi = random.nextInt(8);
            System.out.println("Dizinin " + (usayi + 1) + ".elemanı= " + nolar[usayi]);
        }
    }


    public void diziRasgeleDoldur() {
        for (int i = 0; i <= 7; i++) {
            nolar[i] = random.nextInt(11) + 10;
        }
    }
}
