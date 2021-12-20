package org.example.controller;

import org.example.config.Config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeCsvParser {

    public static void createEmployeeData() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Config.employeeCsvFileLocation()));

            bufferedReader.readLine();

            for(String employeeRecord = bufferedReader.readLine(); employeeRecord != null; employeeRecord = bufferedReader.readLine()){

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
