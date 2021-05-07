package com.company.codCSV;

import com.company.audit;

import java.io.FileWriter;
import java.io.IOException;

public class ScriereOperatie {
    private final static String locatie = "src/com/company/FisiereCSV/operatie.csv";

    public static void ScriereOperatie(String denumire, int durata, int cost_manopera) {
        FileWriter fileWriter;
        audit.saudit("Scriere operatie");
        try {
            fileWriter = new FileWriter((locatie), true);
            String stringBuilder = denumire + "," + durata + "," + cost_manopera + "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}