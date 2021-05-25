package com.company.Database;

import com.company.Angajat;
import com.company.Client;
import com.company.Operatie;
import com.company.Piesa;
import com.company.conDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Add {
    static String url = "jdbc:mysql://localhost:3306/serviceauto";
    static  String username = "root";
    static String password = "159147";

    public static void AddClient(Client client) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO clienti(cnp_client, nume,nr_telefon) VALUES ("+client.getCnp_client()+",'"+client.getNume()+"','"+client.getNr_telefon()+"')";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void AddOperatie(Operatie operatie)
    {
        try
        {
            Connection con = DriverManager.getConnection(url, username,password);
            String query = "INSERT INTO operatii(id_operatie,tip_operatie,denumire_operatie, pret_manopera,durata) VALUES ("+operatie.getId_operatie()+",'"+operatie.getTip_operatie()+"','"+operatie.getDenumire()+"',"+operatie.getCost_manopera()+","+operatie.getDurata()+")";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void AddAngajat(Angajat angajat)
    {
        try
        {
            Connection con = DriverManager.getConnection(url, username,password);
            String query = "INSERT INTO angajati(cnp_angajat, nume, calificare, data_angajarii) VALUES ("+angajat.getCnp_angajat()+",'"+angajat.getNume()+",'"+angajat.getCalificare()+",'"+angajat.getData_angajarii()+",')";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void AddPiesa(Piesa piesa)
    {
        try
        {
            Connection con = DriverManager.getConnection(url, username,password);
            String query = "INSERT INTO piesa(nr_oem,producator,denumire_piesa,pret_piesa) VALUES ("+piesa.getNr_oem()+",'"+piesa.getProducator()+",'"+ piesa.getDenumire()+",'"+piesa.getPret()+",')";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();

            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
