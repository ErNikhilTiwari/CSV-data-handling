package com.bridgelabz.CSV.basicproblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadCount {
    public static void main(String[] args) {
        String filePath = "output.csv";
        int rowCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read and skip the header
            if ((line = reader.readLine()) != null) {
                // Do nothing, skip header
            }

            // Read remaining lines
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    rowCount++;
                } 
            }

            System.out.println("Number of records (excluding header): " + rowCount);

        } catch (IOException e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
        }
    }
}
