package com.company.codCSV;
import com.company.Operatie;
import com.company.audit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CitireOperatie {

    private final static String locatie = "src/com/company/FisiereCSV/operatie.csv";

    public static void CitireOperatie(ArrayList<Operatie> items) {
        audit.saudit("Citire operatie");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(locatie));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                items.add(new Operatie(strings[0],Integer.parseInt(strings[1]),Integer.parseInt(strings[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

