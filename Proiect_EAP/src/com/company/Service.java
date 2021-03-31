package com.company;

public class Service
{
    private String nume_srv;
    private String data_infiintare;
    private String adresa;

    public Service(String nume_srv, String data_infiintare, String adresa) {
        this.nume_srv = nume_srv;
        this.data_infiintare = data_infiintare;
        this.adresa = adresa;
    }

    public void print()
    {
        System.out.println("Denumire service : "+ nume_srv +" Data infiintarii : " + data_infiintare+ " Adresa: " + adresa );

    }
}
