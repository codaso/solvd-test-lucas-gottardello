package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.Date;
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
    public static ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

    //iHospital implementations
    public void registerPatient(Patient patient) {
        amountOfPatients++;
        patientsList.add(patient);
    }


    public void registerAppointment(Appointment appointment) {
        amountOfAppointments++;
        appointmentList.add(appointment);
    }

    public boolean searchDate(Date date) {
        return appointmentList.contains(date);
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
