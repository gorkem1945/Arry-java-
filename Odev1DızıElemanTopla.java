package com.arslaner.collection;

import java.util.Random;

public class Odev1DızıElemanTopla {
    Random random = new Random();
    int[] nolar = new int[100];


    public void eleman() {
        for (int i = 0; i <= 99; i++) {
            nolar[i] = random.nextInt(1001);
        }
    }

    public void elemanGöster() {

        for (int eleman : nolar) {
            System.out.println("Dizinin elemanı = " + eleman);
        }
    }

    public int elemanTopla() {
        int toplam = 0;
        for (int i = 0; i <= 99; i++) {
            toplam = toplam + nolar[i];
        }
        return toplam;
    }

    public int elemanMaxbul() {
        int enb = nolar[0];

        for (int i = 0; i <= 99; i++) {
            if (nolar[i] > enb) {
                enb = nolar[i];
            }

        }

        return enb;
    }

    public int elemenMinBul() {
        int enk = nolar[0];
        for (int i = 1; i <= 99; i++) {
            if (nolar[i] < enk) {
                enk = nolar[i];
            }
        }
        return enk;
    }


    public float elemanStandartSapmaBul() {
        // enb'den enk' cıkarılacak. Eleman sayısına bölünecek.
        float sonuc;
        int islem;

        islem = elemanMaxbul() - elemenMinBul();

        sonuc = islem / 100f;

        return sonuc;

    }

    public void diziIstatıslık() {
        eleman();
        System.out.println("Dizinin en büyük elemanı = " + elemanMaxbul());
        System.out.println("Dizinin en küçük elemanı = " + elemenMinBul());
        System.out.println("Dizilerin toplamı = " + elemanTopla());
        System.out.println("Dizinin standart sapması = "+elemanStandartSapmaBul());
    }

}
