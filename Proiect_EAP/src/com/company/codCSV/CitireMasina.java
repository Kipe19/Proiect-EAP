package com.company.codCSV;

import com.company.Masina;
import com.company.audit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CitireMasina {

    private final static String locatie = "src/com/company/FisiereCSV/masina.csv";

    public static void CitireMasina(ArrayList<Masina> items) {
        audit.saudit("Citire masina");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(locatie));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                items.add(new Masina(strings[0],strings[1],strings[2],strings[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

