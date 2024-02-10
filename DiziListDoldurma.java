package com.arslaner.collection;

import java.util.ArrayList;
import java.util.List;

public class DiziListDoldurma {

    List<Integer> sayilar = new ArrayList<Integer>(); // arrylist tanımı

    public void listeDoldur() {
        sayilar.add(90); // arrylist eleman ekler
        sayilar.add(65);
        sayilar.add(85);
        sayilar.add(35);
    }

    public void listeSıl() {
        sayilar.remove(3);
    }

    public void listMetotlar() {
        System.out.println("Dizinin eleman sayısı = " + sayilar.size()); // arrylist boyunu gösterir.
    }


    public void listOku() {
        for (int i = 0; i < sayilar.size(); i++) {
            System.out.println("Dizinin " + (i + 1) + ".elemanı = " + sayilar.get(i));

        }
    }

    public void serıOku(){
        for (Integer el: sayilar){
            System.out.println(el);
        }
    }

    public void elemanGuncelle(){
        sayilar.set(0,400);
    }

    public void tumDiziSil(){
        sayilar.clear();
    }

}
