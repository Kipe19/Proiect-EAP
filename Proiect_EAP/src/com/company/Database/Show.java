package com.company.Database;

import com.company.Operatie;
import com.company.Piesa;

import java.sql.*;
import java.util.ArrayList;

public class Show {
    static String url = "jdbc:mysql://localhost:3306/serviceauto";
    static  String username = "root";
    static String password = "159147";

    public static void ShowClienti(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM clienti";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String cnp = resultSet.getString("cnp_client");
                String nume = resultSet.getString("nume");
                String nr_tel = resultSet.getString("nr_telefon");
                System.out.println("CNP:"+cnp+"\nNume:" +nume+ "\nNumar de telefon:"+nr_tel+"\n");
            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void ShowAngajati()
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

                System.out.println("CNP:"+cnp+"\nNume:" +nume+ "\nCalificare:"+calificare+ "\nData Angajarii:"+data_ang+"\n");

            }
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void ShowPiese()
    {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM piese";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int nr_oem = resultSet.getInt("nr_oem");
                String producator   = resultSet.getString("producator");
                String denumire_piesa = resultSet.getString("denumire_piesa");
                int pret_piesa = resultSet.getInt("pret_piesa");

                System.out.println("Numar OEM:"+nr_oem+"\nProducator:" +producator+ "\nDenumire :"+denumire_piesa+ "\nPret:"+pret_piesa+"\n");

            }
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void ShowOperatii()
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

                System.out.println("ID:"+id_operatie+"\nTip:" +tip_operatie+ "\nDenumire :"+denumire_operatie+ "\nPret manopera:"+pret_manopera+ "\nDurata:"+durata+"\n");


            }
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
