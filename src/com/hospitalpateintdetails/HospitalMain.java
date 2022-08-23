package com.hospitalpateintdetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HospitalMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hospital name");
        Hospitals hospital = Hospitals.createNewHospital(sc.next());

        boolean doExit = false;

        while (!doExit) {
            System.out.println("\nHospitalList:" + Hospitals.hospitalMap.keySet());
            System.out.println("Select option: \n1.create new hospital \n2.add patient \n3.Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Enter hospital name");
                    hospital = Hospitals.createNewHospital(sc.next());
                }
                case 2 -> hospital.addPatient();
                case 3 -> doExit = true;
                default -> System.out.println("select valid option");
            }
        }
    }
}