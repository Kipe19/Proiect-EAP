package com.company;

import java.util.Date;
import java.time.Duration;

public class Client
{
    protected String nume;
    protected String cnp_client;
    protected String nr_telefon;

    public Client(String nume,String cnp_client, String nr_telefon  )

    {
        this.nume = nume;
        this.cnp_client = cnp_client;
        this.nr_telefon = nr_telefon;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp_client() {
        return cnp_client;
    }

    public void setCnp_client(String cnp_client) {
        this.cnp_client = cnp_client;
    }

    public String getNr_telefon() {
        return nr_telefon;
    }

    public void setNr_telefon(String nr_telefon) {
        this.nr_telefon = nr_telefon;
    }

    public void print()
    {
        System.out.println("Nume :" + nume );
        System.out.println("CNP:"+ cnp_client );
        System.out.println("Numar de telefon: "+ nr_telefon );

    }
}
