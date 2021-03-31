package com.company;


import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Client Chipesu = new Client("Chipesu", "Ciprian", " Passat B6", " 30-03-2021" , "01-04-2021");
        Masina PassatB6 = new Masina("VW", "Passat", "2009"," diesel");
        Angajat Ciprian = new Angajat("Chipesu", "Ciprian", "01-03-2020");
        Piesa  AripaS = new Piesa (" Aripa stanha fata", 200, "Passat", 1);
        Operatie SchimbareE= new Operatie("Inlocuire element", 2,100);
        Service Serv1 = new Service("ProAuto", "01-01-1999", "Targu-Jiu , str. Calea Bucuresti");
        Factura F1 = new Factura("2414141", "01-04-2021","Chipesu Ciprian",400);
        Distribuitor D1= new Distribuitor("ePiesa", "Germania", "VW, Audi, Skoda");



    }
}
