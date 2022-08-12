package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.building.Building;
import com.lucas.solvd.homework2.human.Injury;
import com.lucas.solvd.homework2.human.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Hospital extends Building implements IHospital {
    Logger logger = LogManager.getLogger(Hospital.class);
    public int amountOfPatients;
    public int amountOfAppointments;


    public Hospital() {
        super("");
    }


    public Hospital(String hospitalName) {

        super(hospitalName);

    }

    public static ArrayList<Patient> patientsList = new ArrayList<Patient>();
    public static ArrayList<Appointment> appointmentList = new ArrayList<>();

    //iHospital implementations
    public void registerPatient(Patient patient) {
        amountOfPatients++;
        patientsList.add(patient);
    }

    public int getAmountOfPatients() {
        return amountOfPatients;
    }

    int getPatientListSize() {
        return patientsList.size();
    }

    public void registerAppointment(Appointment appointment) {
        amountOfAppointments++;
        appointmentList.add(appointment);
    }

    public int getAmountOfAppointments() {
        return amountOfAppointments;
    }


    public void printAppointments() {
        for (Appointment e : appointmentList) {
            logger.info(e.patient.getName() + " " + e.patient.getLastName());
            logger.info("Appointment on date: " + e.date.day + "/" + e.date.month + "/" + e.date.year);
        }
    }

    public boolean searchDate(Appointment appointment) {

        return appointmentList.contains(appointment);
    }

    public boolean instantTreatment(Injury injury) {
        if (injury.painLevel > 6 || injury.annoyance == "heart") {
            return true;
        }
        return false;
    }

    //Override
    @Override
    public void typeOfBuilding() {
        logger.info("My time of building is Hospital");
    }


}
