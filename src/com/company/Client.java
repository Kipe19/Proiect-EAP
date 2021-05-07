package com.company;

import java.util.Date;
import java.time.Duration;

public class Client
{
    protected String nume;
    protected String prenume;
    protected String masina;
    protected String data_intrare;
    protected String data_iesire;

    public Client(String nume, String prenume, String masina, String data_intrare,  String data_iesire  )

    {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
        this.data_iesire = data_iesire;
        this.data_intrare = data_intrare;
    }

   /* public float durata_service()
    {
        float durata = (float) (( data_iesire.getTime() - data_intrare.getTime()) / (1000*60*60*24));
        return durata;
    }

    */

    public void print()
    {
        System.out.println("Nume si prenume :" + nume + " " + prenume );
        System.out.println("Masina:"+ masina );
        System.out.println("Data intrare : "+ data_intrare + " Data iesire : " + data_iesire );

    }
}
