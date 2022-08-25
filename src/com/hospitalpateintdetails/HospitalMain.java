package com.hospitalpateintdetails;

import java.util.HashMap;
import java.util.Scanner;

public class HospitalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hospitals hospital = new Hospitals();
        int option;

        do {
            System.out.println("HospitalList:" + Hospitals.hospitalMap.keySet());
            System.out.println("Select Option: \n1.Create New Hospital \n2.Add Patient \n3.Edit Patient \n4.Search Patient\n5.Search Patient By City");
             option = sc.nextInt();
            switch (option) {
                case 1 :
                    System.out.println("Enter Hospital Name");
                    hospital = Hospitals.createNewHospital(sc.next());
                    break;
                case 2 :
                    hospital.addPatient();
                    break;
                case 3 :
                    hospital.editPatient();
                    break;
                case 4 :
                    hospital.searchPatient();
                case 5 :
                    hospital.searchPatientByCity();

                case 6 :
                    hospital.deletePatient();
                    break;
                default :
                    System.out.println("Select Valid Option.");
            }
        }
        while (option!=0);


    }
}