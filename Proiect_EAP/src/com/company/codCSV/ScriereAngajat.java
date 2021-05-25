package com.company.codCSV;

import com.company.audit;
import java.io.FileWriter;
import java.io.IOException;

public class ScriereAngajat {
    private final static String locatie = "src/com/company/FisiereCSV/angajat.csv";

    public static void ScriereAngajat(String cnp_angajat,String Nume, String calificare, String Data) {
        FileWriter fileWriter;
        audit.saudit("Scriere angajat");
        try {
            fileWriter = new FileWriter((locatie), true);
            String stringBuilder = cnp_angajat + ","+ Nume + "," +calificare + "," + Data + "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}