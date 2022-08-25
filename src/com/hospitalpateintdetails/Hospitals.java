package com.hospitalpateintdetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hospitals {

    Scanner sc = new Scanner(System.in);
    static HashMap<String, Hospitals> hospitalMap = new HashMap<>();

    ArrayList<Patients> patientList = new ArrayList<>();

    static Hospitals createNewHospital(String hospitalName) {
        Hospitals hospital = new Hospitals();
        hospitalMap.put(hospitalName, hospital);
        return hospital;
    }

    void addPatient() {

        Patients patient = new Patients();
        patient.selectPatientDepartment();
        System.out.print("Enter Patient Name -> ");
        patient.setPatientName(sc.next());
        System.out.print("Enter Patient Age ->");
        patient.setPatientAge(sc.nextInt());
        System.out.print("Enter Patient City ->");
        patient.setPatientCity(sc.next());
        System.out.print("Enter Patient State ->");
        patient.setPatientState(sc.next());
        System.out.print("Enter Patient Phone Number ->");
        patient.setPatientPhoneNumber(sc.nextLong());
        patientList.add(patient);
        System.out.println(patient);
        System.out.println("Patient Added Successfully");
    }

    void editPatient() {

        System.out.println("------------------------------------");
        System.out.println("Enter The Name Of Patient To Edit -> ");
        String pName = sc.next();

        for (Patients patient : patientList) {

            if (patient.getPatientName().equals(pName)) {
                System.out.println(patient);
                System.out.println("Enter Modified Information  ");
                System.out.print("Enter Patient Name -> ");
                patient.setPatientName(sc.next());
                System.out.print("Enter Patient Age ->");
                patient.setPatientAge(sc.nextInt());
                System.out.print("Enter Patient City ->");
                patient.setPatientCity(sc.next());
                System.out.print("Enter Patient State ->");
                patient.setPatientState(sc.next());
                System.out.print("Enter Patient Phone Number ->");
                patient.setPatientPhoneNumber(sc.nextLong());
                System.out.println(patient);
                System.out.println("Updated Successfully.");
                System.out.println("---------------------------------");

            }
        }
    }

    void searchPatient() {

        System.out.println("---------------------------------------");
        System.out.print("Enter The Name of Patient To Search -> ");
        String pName = sc.next();
        boolean patientFound = false;
        for (Patients patient : patientList) {
            if (patient.getPatientName().equals(pName)) {
                patientFound = true;
                System.out.println("Patient found ->" + patient);
            }
        }
        if (!patientFound) {
            System.out.println("Patient Not Found.");
            System.out.println("----------------------------------");
        }
    }

    void searchPatientByCity() {

        System.out.println("---------------------------------------");
        System.out.print("Enter The Name of City -> ");
        String pName = sc.next();
        boolean patientFound = false;
        for (Patients patient : patientList) {
            if (patient.getPatientCity().equals(pName)) {
                patientFound = true;
                System.out.println("Patient found ->" + patient);
            }
        }
        if (!patientFound) {
            System.out.println("Patient Not Found.");
            System.out.println("----------------------------------");
        }
    }

    void deletePatient() {

        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.print("Enter The Name Of Patient To Remove ->  ");
        String pName = sc.next();
        boolean patientFound = false;
        for (Patients patients : patientList) {
            if (patients.getPatientName().equals(sc.next())) {
                patientFound = true;
                patientList.remove(patients);
                System.out.println("Patient remove Successfully.");
            }
        }
        if (!patientFound) {
            System.out.println("Patient Not Found.");
            System.out.println("-------------------------------------------");

        }
    }
}

