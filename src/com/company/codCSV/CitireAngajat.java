package com.company.codCSV;

import com.company.Angajat;
import com.company.audit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

    public class CitireAngajat {

        private final static String locatie = "src/com/company/FisiereCSV/angajat.csv";

        public static void CitireAngajat(ArrayList<Angajat> items) {
            audit.saudit("Citire angajat");
            BufferedReader bufferedReader;
            try {
                bufferedReader = new BufferedReader(new FileReader(locatie));
                String line = bufferedReader.readLine();
                while ((line = bufferedReader.readLine()) != null) {
                    String[] strings = line.split(",");
                    items.add(new Angajat(strings[0], strings[1], strings[2]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

