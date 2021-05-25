package com.company;

import java.util.Date;

public class Angajat {
    protected String cnp_angajat;
    protected String nume;
    protected String calificare;
    protected String data_angajarii;


    public Angajat(String cnp_angajat,String nume, String calificare, String data_angajarii) {
        this.cnp_angajat = cnp_angajat;
        this.nume = nume;
        this.calificare = calificare;
        this.data_angajarii = data_angajarii;

    }

    public void setCnp_angajat(String cnp_angajat) {
        this.cnp_angajat = cnp_angajat;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCalificare(String calificare) {
        this.calificare = calificare;
    }

    public void setData_angajarii(String data_angajarii) {
        this.data_angajarii = data_angajarii;
    }

    public void print()
    {
        System.out.println("Nume si prenume :"+nume);
        System.out.println("Calificare:"+nume);
        System.out.println("Data angajarii: " + data_angajarii);
    }

    public String getCnp_angajat() {
        return cnp_angajat;
    }

    public String getNume() {
        return nume;
    }

    public String getCalificare() {
        return calificare;
    }

    public String getData_angajarii() {
        return data_angajarii;
    }
}
