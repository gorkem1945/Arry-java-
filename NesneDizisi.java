package com.arslaner.collection;

public class NesneDizisi {
    Isci[] isciler = new Isci[5];


    public NesneDizisi() {
        Isci i1 = new Isci("Semıh", "Arslan", 55.5f);
        Isci i2 = new Isci("Mert", "Kavkacı", 80.9f);
        Isci i3 = new Isci("Görkem", "Arslaner", 45.5f);
        Isci i4 = new Isci("Yusuf", "Öztürk", 51.7f);
        Isci i5 = new Isci("Emdullah", " Gündoğdu", 64.1f);


        isciler[0] = i1;
        isciler[1] = i2;
        isciler[2] = i3;
        isciler[3] = i4;
        isciler[4] = i5;
    }

    public void maaslariTopla() {
        float maas = 0f;

        for (Isci el : isciler) {
            maas = maas + el.getMaas();
        }
        System.out.println("İşçilerin maaşlarının toplamı = " + maas);
    }

    public void enYuksekMaasBul() {
        float enb = isciler[0].getMaas();
        Isci enbmaasIsci = null;

        for (Isci isci : isciler) {
            if (isci.getMaas() > enb) {
                enb = isci.getMaas();
                enbmaasIsci = isci;
            }
        }

        System.out.println("İşçilerimizden " + enbmaasIsci.getAd() + " " + enbmaasIsci.getSad() + " " + enbmaasIsci.getMaas() + " ile en yüksek maaşı almaktadır.");
        System.out.println(enb);
    }

    public void enKucukMaasBul(){
        float enk = isciler [0].getMaas();
        Isci enkmaasIsci = null;

        for (Isci isci : isciler){
            if (isci.getMaas() < enk) {
                enk = isci.getMaas();
                enkmaasIsci = isci;
            }
        }

        System.out.println("İşçilerimizden "+enkmaasIsci.getAd()+ " " +enkmaasIsci.getSad()+ " " +enkmaasIsci.getMaas() + " ile en düşük maaşı almaktadır.");
        System.out.println(enk);
    }
}