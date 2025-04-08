package com.bridgelabz.CSV.basicproblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ReadPrint {

    public static void main(String[] args) {

        String filePath = "student1.csv";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                System.out.println("ID: " + columns[0] + ", Name:" + columns[1]);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }



    }
}
