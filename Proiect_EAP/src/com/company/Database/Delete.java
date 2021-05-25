package com.company.Database;
import com.company.Angajat;
import com.company.Client;
import com.company.Operatie;
import com.company.Piesa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Delete {
    static String url = "jdbc:mysql://localhost:3306/serviceauto";
    static String username = "root";
    static String password = "159147";

    public static void DeleteClient(ArrayList<Client> client, String cnp) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM clienti WHERE cnp_client='" + cnp + "'";


            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();
            con.close();
            client.clear();
            Load.LoadClienti(client);
        }
         catch (SQLException throwables) {
            throwables.printStackTrace();
            client.clear();
        }


    }
    public static void DeleteAngajat(ArrayList<Angajat> angajat, String cnp) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM angajati WHERE cnp_angajat='" + cnp + "'";


            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();
            con.close();
            angajat.clear();
            Load.LoadAngajati(angajat);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            angajat.clear();
        }


    }

    public static void DeletePiesa(ArrayList<Piesa> piesa, int oem) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM piese WHERE nr_oem=" + oem ;

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();
            con.close();
            piesa.clear();
            Load.LoadPiese(piesa);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            piesa.clear();
        }


    }
    public static void DeleteOperatie(ArrayList<Operatie> operatie, int id) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM operatii WHERE id_operatie=" + id + "";


            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();
            con.close();
            operatie.clear();
            Load.LoadOperatii(operatie);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            operatie.clear();
        }


    }




}

