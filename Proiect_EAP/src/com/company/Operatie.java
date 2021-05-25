package com.company;

public class Operatie {
    private String id_operatie;
    private String tip_operatie;
    private String denumire;
    private int durata;
    private int cost_manopera;

    public Operatie(String id_operatie,String tip_operatie, String denumire, int durata, int cost_manopera) {
        this.id_operatie = id_operatie;
        this.tip_operatie = tip_operatie;
        this.denumire = denumire;
        this.durata = durata;
        this.cost_manopera = cost_manopera;
    }

    public int cost_total()
    {
        int cost_total = cost_manopera * durata ;

        return cost_total;
    }

    public void setId_operatie(String id_operatie) {
        this.id_operatie = id_operatie;
    }

    public void setTip_operatie(String tip_operatie) {
        this.tip_operatie = tip_operatie;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setCost_manopera(int cost_manopera) {
        this.cost_manopera = cost_manopera;
    }

    public void print()
    {
          System.out.println("Id-ul si tipul operatiei: "+ id_operatie + " " + tip_operatie);
          System.out.println("Denumire operatie : " + denumire);
          System.out.println("Durata si costul operatiei :" + durata + " " +cost_manopera +"lei/h");
    }

    public String getId_operatie() {
        return id_operatie;
    }

    public String getTip_operatie() {
        return tip_operatie;
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
