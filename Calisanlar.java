package com.arslaner.fabrikaiscileri;

public class Calisanlar {

    String ad;
    String sad;
    float maas;

    public Calisanlar(String ad, String sad, float maas) {
        this.ad = ad;
        this.sad = sad;
        this.maas = maas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSad() {
        return sad;
    }

    public void setSad(String sad) {
        this.sad = sad;
    }

    public float getMaas() {
        return maas;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }
}
