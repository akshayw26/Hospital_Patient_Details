package com.hospitalpateintdetails;

import java.security.Permission;
import java.util.ArrayList;
import java.util.Scanner;

public class Hospitals {


    enum Departments { oncology, neurology, cardiology, gynocology }


    ArrayList<Patients> patientsList = new ArrayList<>();

    public void addPatient() {



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name -> ");
        String name = scan.next();
        System.out.println("Enter age -> ");
        int age = scan.nextInt();
        System.out.println("Enter Phone Number -> ");
        int phoneNumber = scan.nextInt();
        System.out.println("Enter city -> ");
        String city = scan.next();
        System.out.println("Enter state -> ");
        String state = scan.next();
        String department = scan.next();
        System.out.println("Enter Department -> ");

        Patients patient = new Patients();
        patient.setName(name);
        patient.setAge(age);
        patient.setCity(city);
        patient.setState(state);

        patientsList.add(patient);
    }




    }
