package com.company;

public class Piesa {
    private String denumire;
    private int pret;
    private String producator;
    private String nr_oem;

    public Piesa(String denumire, int pret, String producator, String nr_oem) {
        this.denumire = denumire;
        this.pret = pret;
        this.producator = producator;
        this.nr_oem = nr_oem;
    }

    public int getPret() {
        return pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getNr_oem() {
        return nr_oem;
    }

    public void setNr_oem(String nr_oem) {
        this.nr_oem = nr_oem;
    }

    public void print()
    {
        System.out.println("Denumire piesa :" + denumire + " Pret : " + pret + " Producator : " + producator);
    }
}
