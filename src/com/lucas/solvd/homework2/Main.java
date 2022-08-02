package com.lucas.solvd.homework2;

import com.lucas.solvd.homework2.building.hospital.Hospital;
import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.specialty.Traumatologist;
import com.lucas.solvd.homework2.human.patient.Patient;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("BestHospital");
        System.out.println("Building ID: " + hospital.getBuildingID());
        System.out.println("Building name: " + hospital.getBuildingName());

        Doctor juan = new Traumatologist("Juan", "Rotcod");
        hospital.registerDoctor(juan);
        Patient lucas = new Patient("Lucas", "Gottar", "male", 18);
        hospital.registerPatient(lucas);


    }
}
