package com.company;


import com.company.codCSV.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Client Chipesu = new Client("Chipesu", "Ciprian", " Passat B6", " 30-03-2021", "01-04-2021");
        Masina PassatB6 = new Masina("VW", "Passat", "2009", " diesel");
        Angajat Ciprian = new Angajat("Chipesu", "Ciprian", "01-03-2020");
        Piesa AripaS = new Piesa(" Aripa stanha fata", 200, "Passat", 1);
        Piesa AripaD = new Piesa("Aripa dreapta fata", 200, "Passat", 1);
        Operatie SchimbareE = new Operatie("Inlocuire element", 2, 100);
        Service Serv1 = new Service("ProAuto", "01-01-1999", "Targu-Jiu , str. Calea Bucuresti");
        Factura F1 = new Factura("2414141", "01-04-2021", "Chipesu Ciprian", 400);
        Distribuitor D1 = new Distribuitor("ePiesa", "Germania", "VW, Audi, Skoda");


        PretPiese pret1 = PretPiese.getInstance();
        pret1.TotalPiese(AripaD.getPret(), AripaS.getPret());

        ArrayList<Angajat> ang = new ArrayList<Angajat>();
        CitireAngajat.CitireAngajat(ang);
        for (int i = 0; i < ang.size(); i++) {
            System.out.println(ang.get(i).getNume());
        }

        ScriereAngajat.ScriereAngajat("Olteanu", "Marian", "19-05-2018");
        audit.saudit("Scriere Angajat");
        audit.saudit("Citire Angajat");

        ArrayList<Operatie> op = new ArrayList<>();
        CitireOperatie.CitireOperatie(op);
        for (int i = 0; i < op.size(); i++) {
            System.out.println(op.get(i).getDenumire());
        }

        ScriereOperatie.ScriereOperatie("Schimbare Aripa", 2, 190);


        ArrayList<Masina> mas = new ArrayList<Masina>();
        CitireMasina.CitireMasina(mas);
        for (int i = 0; i < mas.size(); i++) {
            System.out.println(mas.get(i).getModel());
        }
    }
}
