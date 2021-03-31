package com.company;

public class Piesa {
    private String denumire;
    private int pret;
    private String compatibilitate;
    private int cantitate;

    public Piesa(String denumire, int pret, String compatibilitate, int cantitate) {
        this.denumire = denumire;
        this.pret = pret;
        this.compatibilitate = compatibilitate;
        this.cantitate = cantitate;
    }

    public int cost_total()
    {
        int cost_t=pret*cantitate;
        return cost_t;
    }
    public void print()
    {
        System.out.println("Denumire piesa :" + denumire + " Pret : " + pret + " Compatibilitate : " + compatibilitate);
    }
}
