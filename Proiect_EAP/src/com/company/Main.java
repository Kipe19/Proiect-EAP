package com.company;


import com.company.Menu.Menu;
import com.company.codCSV.*;
import com.company.conDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // ETAPA 1
        /*
        Client Chipesu = new Client("Chipesu Catalin", "5000719180019", "0726742936");
        Masina PassatB6 = new Masina("VW", "Passat", "2009", " diesel");
        Angajat Ciprian = new Angajat("5000519180019", "Ciprian", "Vopsitor","01-03-2021");
        Piesa AripaS = new Piesa(" Aripa stanga fata", 200, "Luk", 15163213);
        Piesa AripaD = new Piesa("Aripa dreapta fata", 200, "Luk", 16541654);
        Operatie SchimbareE = new Operatie("1", "Mecanica", "Schimbare element", 1, 100);
        Service Serv1 = new Service("ProAuto", "01-01-1999", "Targu-Jiu , str. Calea Bucuresti");
        Factura F1 = new Factura("2414141", "01-04-2021", "Chipesu Ciprian", 400);
        Distribuitor D1 = new Distribuitor("ePiesa", "Germania", "VW, Audi, Skoda");


        PretPiese pret1 = PretPiese.getInstance();
        pret1.TotalPiese(AripaD.getPret(), AripaS.getPret());
        //ETAPA 2

        ArrayList<Angajat> ang = new ArrayList<Angajat>();
        CitireAngajat.CitireAngajat(ang);
        for (int i = 0; i < ang.size(); i++) {
            System.out.println(ang.get(i).getNume());
        }

        ScriereAngajat.ScriereAngajat("50000619180019", "Olteanu Marian", "Tinichigiu","05-12-2021");
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

         */

         ////Etapa 3

        String url = "jdbc:mysql://localhost:3306/serviceauto";
        String username = "root";
        String password = "159147";

        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

        Menu.getInstance().menu();

    }
}
