package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.Date;
import com.lucas.solvd.homework2.LinkedListHuman;
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

    public static LinkedListHuman<Patient> patientList = new LinkedListHuman<>();
    public static LinkedListHuman<Doctor> doctorList = new LinkedListHuman<>();
    public static ArrayList<Appointment> appointmentList = new ArrayList<>();
    public static ArrayList<Date> dateList = new ArrayList<>();


    public void loadDoctors() {
        Cardiologist cardiologist = new Cardiologist("Cardio", "Logist");
        Psychologist psychologist = new Psychologist("Psycho", "Logist");
        Clinician clinician = new Clinician("Clinic", "Ian");
        Dermatologist dermatologist = new Dermatologist("Derma", "Tologist");
        Pediatrician pediatrician = new Pediatrician("Pedia", "Trician");
        Traumatologist traumatologist = new Traumatologist("Trauma", "Tologist");
        doctorList.addHuman(cardiologist);
        doctorList.addHuman(psychologist);
        doctorList.addHuman(clinician);
        doctorList.addHuman(dermatologist);
        doctorList.addHuman(pediatrician);
        doctorList.addHuman(traumatologist);
    }


    public void registerDoctor(Doctor doctor) {
        doctorList.addHuman(doctor);
    }

    public void registerPatient(Patient patient) {
        patientList.addHuman(patient);
    }

    public void printDoctorList() {
        doctorList.printHumans(doctorList.root);
    }

    public void printPatientList() {
        patientList.printHumans(patientList.root);
    }


    int getPatientListSize() {
        return patientList.size();
    }

    int getDoctorListSize() {
        return doctorList.size();
    }

    public void registerDate(Date date) {
        dateList.add(date);
    }

    public void registerAppointment(Appointment appointment) {
        appointmentList.add(appointment);
    }

    public void printAppointments() {
        for (Appointment e : appointmentList) {
            logger.info(e.patient.getName() + " " + e.patient.getLastname());
            logger.info("Appointment on date: " + e.date.day + "/" + e.date.month + "/" + e.date.year);
        }
    }

    public void treatment(String annoyance, Patient patient) {
        Treatment treatment = new Treatment(annoyance, patient);
        treatment = null;
    }

    public Object recieveDoctor(String doctorSpecialty) {
        Object obj = (Doctor) doctorList.retrieveDoctor(doctorSpecialty);
        return obj;
    }
    
    @Override
    public void typeOfBuilding() {
        logger.info("My time of building is Hospital");
    }


}
