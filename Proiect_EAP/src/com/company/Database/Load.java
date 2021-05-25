package com.company.Database;


import com.company.Angajat;
import com.company.Client;
import com.company.Operatie;
import com.company.Piesa;

import java.sql.*;
import java.util.ArrayList;
public class Load {

    static String url = "jdbc:mysql://localhost:3306/serviceauto";
    static  String username = "root";
    static String password = "159147";

    public static void LoadClienti(ArrayList<Client> clienti) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM clienti";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String cnp = resultSet.getString("cnp_client");
                String nume = resultSet.getString("nume");
                String nr_tel = resultSet.getString("nr_telefon");

                clienti.add(new Client(cnp,nume,nr_tel));
            }
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void LoadAngajati(ArrayList<Angajat> angajati)
    {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM angajati";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String cnp = resultSet.getString("cnp_angajat");
                String nume = resultSet.getString("nume");
                String calificare = resultSet.getString("calificare");
                String data_ang = resultSet.getString("data_angajarii");

                angajati.add(new Angajat(cnp,nume,calificare,data_ang));
        }
        con.close();

    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
    }
    public static void LoadPiese(ArrayList<Piesa> piese)
    {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM piese";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String nr_oem = resultSet.getString("nr_oem");
                String producator   = resultSet.getString("producator");
                String denumire_piesa = resultSet.getString("denumire_piesa");
                int pret_piesa = resultSet.getInt("pret_piesa");

                piese.add(new Piesa(denumire_piesa,pret_piesa,producator,nr_oem));
            }
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void LoadOperatii(ArrayList<Operatie> operatii)
    {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM operatii";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String id_operatie = resultSet.getString("id_operatie");
                String tip_operatie   = resultSet.getString("tip_operatie");
                String denumire_operatie = resultSet.getString("denumire_operatie");
                int pret_manopera = resultSet.getInt("pret_manopera");
                int durata = resultSet.getInt("durata");

                operatii.add(new Operatie(id_operatie,tip_operatie,denumire_operatie,durata,pret_manopera));
            }
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
