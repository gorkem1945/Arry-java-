package com.arslaner.human;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsanGiris {
    Scanner sc = new Scanner(System.in);
    List<Insan> insan = new ArrayList<>(5);

    public void insanGirisYapilacak() {
        for (int a = 1; a <= 5; a++) {
            klavyeBilgiAl(a);
        }

    }

    public void klavyeBilgiAl(int x) {
        String ad;
        String sad;
        int yas;

        System.out.println(x + " Kişinin Adını giriniz.");
        ad = sc.next();
        System.out.println(x + " Kişinin Soyadını giriniz.");
        sad = sc.next();
        System.out.println(x + " Kişinin Yaşını giriniz.");
        yas = sc.nextInt();

        Insan i = new Insan(ad, sad, yas);
        insan.add(i);
    }

    public void enYuksekYas() {
        int enb = insan.get(0).getYas();

        for (Insan enyaslı : insan) {
            if (enyaslı.getYas() > enb) {
                enb = enyaslı.getYas();
                System.out.println("En yaşlı insan " + enyaslı.getAd()+ " "+ enyaslı.getSad() + " "+enyaslı.getYas());
            }
        }
    }

    public void enGencBilgi(){
        int eng = insan.get(0).getYas();

        for (Insan engenc : insan) {
            if (engenc.getYas() > eng) {
                eng = engenc.getYas();
                System.out.println("En genç insan "+ engenc.getAd() + " "+ engenc.getSad() + engenc.getYas());
            }
        }
    }
}

