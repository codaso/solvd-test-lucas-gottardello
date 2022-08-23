package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.Date;
import com.lucas.solvd.homework2.LinkedListHuman;
import com.lucas.solvd.homework2.building.Building;
import com.lucas.solvd.homework2.human.Human;
import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.Doctors;
import com.lucas.solvd.homework2.human.doctor.specialty.*;
import com.lucas.solvd.homework2.human.patient.Patient;
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

    public static Doctor[] doctorArr = new Doctor[6];
    public static ArrayList<Appointment> appointmentList = new ArrayList<>();
    public static ArrayList<Date> dateList = new ArrayList<>();


    public void loadDoctors() {
        Cardiologist cardiologist = new Cardiologist();
        Psychologist psychologist = new Psychologist();
        Clinician clinician = new Clinician();
        Dermatologist dermatologist = new Dermatologist();
        Pediatrician pediatrician = new Pediatrician();
        Traumatologist traumatologist = new Traumatologist();
        doctorArr[0] = cardiologist;
        doctorArr[1] = clinician;
        doctorArr[2] = dermatologist;
        doctorArr[3] = pediatrician;
        doctorArr[4] = psychologist;
        doctorArr[5] = traumatologist;
    }


    public void addPatient(Patient patient) {
        patientList.addHuman(patient);
    }


    public void printPatientList() {
        patientList.printHumans(patientList.root);
    }

    public void printDoctorsMainFocus(Doctors[] doctorsEnum) {
        for (int i = 0; i < doctorsEnum.length; i++) {
            logger.info(("*") + " ) " + doctorsEnum[i].mainFocus());
        }
    }

    public int getDocCost(int i) {
        return doctorArr[i].getSalary();
    }

    public String getDocPrescription(int i) {
        return doctorArr[i].getPrescription();
    }

    public String getAvailableDays(int i) {
        return doctorArr[i].getAvailableDays();
    }

    int getPatientListSize() {
        return patientList.size();
    }


    public Date searchFreeDate() {
        int currentMonth = getCurrentMonth();
        Date d = new Date(1, currentMonth, 2022);
        while (d.month < 13) {
            if (dateList.contains(d)) {
                d.day++;
            }
            if (d.day == 31) {
                d.day = 1;
                d.month++;
            } else if (!dateList.contains(d)) {

                logger.info(" [Your date with the doctor will be on day: " + d.day + ", month: " + d.month + ",year: " + d.year + "]");
                return d;
            }
            if (d.month == 12) {
                logger.info("We do not have an available day for you, come back next year");
                return null;
            }
        }
        return null;
    }

    int getCurrentMonth() {
        return 8;
    }

    public void registerDate(Date date) {
        dateList.add(date);
    }

    public void registerAppointment(Patient patient, Date date) {
        Appointment appointment = new Appointment(patient, date);
        appointmentList.add(appointment);
    }

    public void printAppointments() {
        for (Appointment e : appointmentList) {
            logger.info(e.patient.getName() + " " + e.patient.getLastname());
            logger.info("Appointment on date: " + e.date.day + "/" + e.date.month + "/" + e.date.year);
        }
    }

    public int treatment(String annoyance, Patient patient) {
        Treatment trea = new Treatment();
        return trea.treat(annoyance, patient);
        

    }

    public void deletePatient(Human human) {
        patientList.deleteNode(human);
    }

    public boolean choice(String str, Choice yesOrNo) {
        return yesOrNo.yesOrNo(str);
    }

    @Override
    public void typeOfBuilding() {
        logger.info("My time of building is Hospital");
    }


}
