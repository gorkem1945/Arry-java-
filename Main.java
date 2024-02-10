package com.arslaner;

import com.arslaner.collection.*;
import com.arslaner.fabrikaiscileri.CalisanDolum;
import com.arslaner.human.InsanGiris;

public class Main {

    public static void main(String[] args) {

        Arrays arrays = new Arrays();
        //arrays.diziRasgeleDoldur();
        //arrays.arryForEach();
        //arrays.arryFor();
        //arrays.dizidenIlkveSonElemaniOku();
        //arrays.dizidenRasgeleUcElemanOku();
        //arrays.diziRasgeleDoldur();
        SansTopu sans = new SansTopu();
        sans.numaraGir();
        System.out.println("*********************OYNADIĞINIZ KUPON*********************");
        sans.cark();
        sans.sonuccs();

        NesneDizisi nd = new NesneDizisi();
        //nd.maaslariTopla();
        //nd.enYuksekMaasBul();
        //nd.enKucukMaasBul();

        DiziListDoldurma dd = new DiziListDoldurma();
        //dd.listeDoldur();
        //dd.listMetotlar();
        //dd.listOku();
        //dd.serıOku();

        CalisanDolum cd = new CalisanDolum();
        //cd.elemanlarıDoldur();
        //cd.elemanMaaslariTopla();
        //cd.enYuksekMaasiBul();
        //cd.enKucukMaasiBul();
        //cd.elemanGuncelle();
        //cd.elemanSil();
        //cd.elemanTumOku();

        InsanGiris ig = new InsanGiris();
        //ig.insanGirisYapilacak();
        //ig.enYuksekYas();
    }
}
