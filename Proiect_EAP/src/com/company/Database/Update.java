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
public class Update {
    static String url = "jdbc:mysql://localhost:3306/serviceauto";
    static  String username = "root";
    static String password = "159147";

    public static void UpdateNumeClient(ArrayList<Client> client, String cnp, String nume) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "UPDATE clienti SET nume='"+nume+"' WHERE cnp_client='"+ cnp+"'";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();
            con.close();
            client.clear();
            Load.LoadClienti(client);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        }


    public static void UpdateNumeAngajat(ArrayList<Angajat> angajat, String cnp, String nume) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "UPDATE angajati SET nume='"+nume+"' WHERE cnp_angajat='"+ cnp+"'";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();
            con.close();
            angajat.clear();
            Load.LoadAngajati(angajat);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void UpdateDenumirePiesa(ArrayList<Piesa> piesa, int nr_oem, String denumire) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "UPDATE piese SET denumire='"+denumire+"' WHERE nr_oem="+ nr_oem+"";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();
            con.close();
            piesa.clear();
            Load.LoadPiese(piesa);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void UpdateDenumireOperatie(ArrayList<Operatie> operatie, int id, String denumire) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "UPDATE operatii SET denumire_operatie='"+denumire+"' WHERE id="+id+"";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();
            con.close();
            operatie.clear();
            Load.LoadOperatii(operatie);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
