package com.company;

public class Distribuitor {
    private String nume_dst;
    private String tara_origine;
    private String marci_autorizate;

    public Distribuitor(String nume_dst, String tara_origine, String marci_autorizate) {
        this.nume_dst = nume_dst;
        this.tara_origine = tara_origine;
        this.marci_autorizate = marci_autorizate;
    }

    public void print()
    {
        System.out.println("Distribuitor : " + nume_dst + " Tara : " + tara_origine + " Marci autorizate : " + marci_autorizate);
    }
}
