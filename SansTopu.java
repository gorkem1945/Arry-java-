package com.arslaner.collection;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Random;
import java.util.Scanner;

public class SansTopu {
    int[] toplar = new int[6];
    int[] gırılen = new int[6];
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public void cark() {

        for (int a = 0; a <= 5; a++) {
            boolean bayrak = false;
            int usayi = random.nextInt(49) + 1;

            for (int x = 0; x <= 5; x++) {
                if (toplar[x] == usayi) {
                    bayrak = true;
                    break;
                }
            }

            if (!bayrak) {
                toplar[a] = usayi;
            } else {
                a--;
                continue;
            }
        }

    }

    public void numaraGir() { // ŞANS TOPUNU OYNAYAN KİŞİNİN GİRDİĞİ NOLAR
        int gNumber;
        int index = 0;

        while (index <= 5) {
            boolean bayrak = false;
            System.out.println((index + 1) + "  . numaranı gir= ");
            gNumber = sc.nextInt();
            if (gNumber < 1 || gNumber >= 50) {
                System.out.println("Girilen numara 1-49 arasında olmalıdır....");
                continue;
            }

            for (int i = 0; i <= 5; i++) {
                if (gırılen[i] == gNumber) {
                    bayrak = true;
                    break;
                }
            }

            if (!bayrak){
                gırılen[index]=gNumber;
                index++;
            }else{
                System.out.println("Bu numarayı daha önce oynadını. Başka numara oynayınız....");
            }
        }

    }

    public void sonuccs(){
        int sayac=0;

        for (int els: toplar){
            for (int elg: gırılen){
                if (els==elg){
                    sayac++;
                    break;
                }
            }
        }
        System.out.println("----------------------------SONUÇ= BU HAFTA "+sayac+" TUTTURDUNUZ----------------------------"+gırılen);
    }
}


