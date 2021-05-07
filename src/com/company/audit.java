
package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class audit {
    public static void saudit (String actiune) {
        String locatie = "src/com/company/FisiereCSV/audit.csv";
        try {
            FileWriter fileWriter = new FileWriter(locatie, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            Date date = new Date();

            printWriter.println(actiune + "," + date.toString());
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}