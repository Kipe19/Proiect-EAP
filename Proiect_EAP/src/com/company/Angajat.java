package com.company;

import java.util.Date;

public class Angajat {
    protected String nume;
    protected String prenume;
    protected String data_angajarii;


    public Angajat(String nume, String prenume, String data_angajarii) {
        this.nume = nume;
        this.prenume = prenume;
        this.data_angajarii = data_angajarii;

    }

    public void print()
    {
        System.out.println("Nume si prenume :"+nume+ " "+ prenume);
        System.out.println("Data angajarii: " + data_angajarii);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getData_angajarii() {
        return data_angajarii;
    }
}
