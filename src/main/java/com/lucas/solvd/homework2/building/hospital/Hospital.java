package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.LinkedList;
import com.lucas.solvd.homework2.building.Building;
import com.lucas.solvd.homework2.human.Patient;
import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.specialty.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Hospital extends Building implements IHospital {
    Logger logger = LogManager.getLogger(Hospital.class);

    public Hospital() {
        super("");
    }


    public Hospital(String hospitalName) {

        super(hospitalName);

    }

    public static LinkedList<Doctor> doctorLinkedList = new LinkedList<>();
    public static ArrayList<Patient> patientsList = new ArrayList<Patient>();
    public static ArrayList<Appointment> appointmentList = new ArrayList<>();

    public void loadDoctors() {
        Cardiologist cardiologist = new Cardiologist("Cardio", "Logist");
        Psychologist psychologist = new Psychologist("Psycho", "Logist");
        Clinician clinician = new Clinician("Clinic", "Ian");
        Dermatologist dermatologist = new Dermatologist("Derma", "Tologist");
        Pediatrician pediatrician = new Pediatrician("Pedia", "Trician");
        Traumatologist traumatologist = new Traumatologist("Trauma", "Tologist");
        doctorLinkedList.addObject(cardiologist);
        doctorLinkedList.addObject(psychologist);
        doctorLinkedList.addObject(clinician);
        doctorLinkedList.addObject(dermatologist);
        doctorLinkedList.addObject(pediatrician);
        doctorLinkedList.addObject(traumatologist);
    }

    public void printDoctorList() {
        doctorLinkedList.printAllValues(doctorLinkedList.root);
    }


    //iHospital implementations
    public void registerPatient(Patient patient) {

        patientsList.add(patient);
    }


    int getPatientListSize() {
        return patientsList.size();
    }

    public void registerAppointment(Appointment appointment) {
        appointmentList.add(appointment);
    }


    public void printAppointments() {
        for (Appointment e : appointmentList) {
            logger.info(e.patient.getName() + " " + e.patient.getLastName());
            logger.info("Appointment on date: " + e.date.day + "/" + e.date.month + "/" + e.date.year);
        }
    }


    //Override
    @Override
    public void typeOfBuilding() {
        logger.info("My time of building is Hospital");
    }


}
