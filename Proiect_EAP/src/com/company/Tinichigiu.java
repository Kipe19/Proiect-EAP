package com.company;

import java.util.Date;

public class Tinichigiu extends Angajat{
    private String calificare;
    private int nr_boxa;


    public Tinichigiu(String nume, String prenume, Date data_angajarii, String calificare, int nr_boxa) {
        super(nume, prenume, data_angajarii);
        this.calificare = calificare;
        this.nr_boxa = nr_boxa;
    }

    public void print_tinichigiu()
    {
        print();
        System.out.println("Calificare : " + calificare + " Numarul boxei de lucru : " + nr_boxa );
    }
}
