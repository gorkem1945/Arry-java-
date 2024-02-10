package com.arslaner.fabrikaiscileri;

import java.util.ArrayList;
import java.util.List;

public class CalisanDolum {
    List<Calisan> eleman = new ArrayList<Calisan>();

    public void elemanlarıDoldur() {
        eleman.add(0, new Calisan("Görkem", "Arslaner", 80.9f));
        eleman.add(1, new Calisan("Mert", "Kavkaci", 45.2f));
        eleman.add(2, new Calisan("Cumali", "Aydın", 60.8f));
        eleman.add(3, new Calisan("Yusuf", "Öztürk", 63.7f));
        eleman.add(4, new Calisan("Metin", "Sarıboğa", 55.8f));
        eleman.add(5, new Calisan("Hakan", "Sunal", 75.6f));
        eleman.add(6, new Calisan("Talha", "Dede", 68.9f));
        eleman.add(7, new Calisan("Oğuzhan", "Kırlı", 73.8f));
        eleman.add(8, new Calisan("Semih", "Arslan", 60.9f));
        eleman.add(9, new Calisan("Abdullah", "Gündoğdu", 71.6f));
    }

    public void elemanMaaslariTopla() {
        float maas = 0f;
        for (Calisan el : eleman) {
            maas = maas + el.getMaas();
        }
        System.out.println("Fabrikamızdaki işçilerin toplam maaşları = " + maas);

    }

    public void enYuksekMaasiBul() {
        float enb = eleman.get(0).getMaas();
        Calisan enbCalisan = eleman.get(0);

        for (Calisan elemanss : eleman) {
            if (elemanss.getMaas() > enb) {
                enb = elemanss.getMaas();
                enbCalisan = elemanss;
            }
        }
        System.out.println("Fabrikamızdaki işçilerimizden " + enbCalisan.getAd() + " " + enbCalisan.getSad() + " " + enbCalisan.getMaas() + " alarak en yüksek maaşa sahip.");
        System.out.println(enb);
    }


    public void enKucukMaasiBul() {
        float enk = eleman.get(0).getMaas();
        Calisan enkCalisan = null;

        for (Calisan elemanlarss : eleman) {
            if (elemanlarss.getMaas() < enk) {
                enk = elemanlarss.getMaas();
                enkCalisan = elemanlarss;
            }

        }

        System.out.println("Fabrikamızdaki işçilerimizden " + enkCalisan.getAd() + " " + enkCalisan.getSad() + " " + enkCalisan.getMaas() + " alarak en düşük maaşa sahip. ");
    }

    public void elemanSil() {
        eleman.remove(9);
    }

    public void elemanGuncelle() {
        eleman.set(1, new Calisan("Danyal", "Uygur", 57.8f));
    }

    public void elemanTumOku() {
        System.out.println("Fabrikamızda = " + eleman.size() + " kadar çalışan vardır.");
    }
}