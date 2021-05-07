package com.company.codCSV;

import com.company.audit;

import java.io.FileWriter;
import java.io.IOException;

public class ScriereMasina {
    private final static String locatie = "src/com/company/FisiereCSV/masina.csv";

    public static void ScriereMasina(String marca, String model, String an_fab, String combustibil) {
        FileWriter fileWriter;
        audit.saudit("Scriere masina");
        try {
            fileWriter = new FileWriter((locatie), true);
            String stringBuilder = marca + "," + model + "," + an_fab + ","+ combustibil+"\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}