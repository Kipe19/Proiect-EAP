package com.company;

public class Operatie {
    private String denumire;
    private int durata;
    private int cost_manopera;

    public Operatie(String denumire, int durata, int cost_manopera) {
        this.denumire = denumire;
        this.durata = durata;
        this.cost_manopera = cost_manopera;
    }

    public int cost_total()
    {
        int cost_total = cost_manopera * durata ;

        return cost_total;
    }

    public void print()
    {
          System.out.println("Denumire operatie : " + denumire);
          System.out.println("Durata si costul operatiei :" + durata + " " +cost_manopera +"lei/h");
    }

    public String getDenumire() {
        return denumire;
    }

    public int getDurata() {
        return durata;
    }

    public int getCost_manopera() {
        return cost_manopera;
    }
}
