package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.Date;
import com.lucas.solvd.homework2.building.Building;
import com.lucas.solvd.homework2.exceptions.InvalidAgeException;
import com.lucas.solvd.homework2.exceptions.InvalidAnnoyanceException;
import com.lucas.solvd.homework2.exceptions.InvalidGenderException;
import com.lucas.solvd.homework2.exceptions.InvalidNameException;
import com.lucas.solvd.homework2.human.Human;
import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.doctor.Doctors;
import com.lucas.solvd.homework2.human.doctor.specialty.*;
import com.lucas.solvd.homework2.human.patient.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Hospital extends Building implements IHospital {
    Logger logger = LogManager.getLogger(Hospital.class);
    Doctor[] doctorArr = new Doctor[6];
    LinkedList<Patient> patientList = new LinkedList<>();

    public Hospital() {
        super("");
    }

    public Hospital(String hospitalName) {
        super(hospitalName);
    }

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

    public void generatePatients() {
        try {
            Patient patient1 = new Patient("patient1", "one", "male", 10);
            Patient patient2 = new Patient("patient2", "two", "female", 15);
            Patient patient3 = new Patient("patient3", "three", "male", 20);
            Patient patient4 = new Patient("patient4", "four", "female", 25);
            Patient patient5 = new Patient("patient5", "five", "female", 30);
            Patient patient6 = new Patient("patient6", "six", "male", 35);
            addPatient(patient1);
            addPatient(patient2);
            addPatient(patient3);
            addPatient(patient4);
            addPatient(patient5);
            addPatient(patient6);
        } catch (InvalidAgeException | InvalidNameException | InvalidGenderException e) {
            logger.error(e);
        }
    }


    public void addPatient(Patient patient) {
        patientList.add(patient);
    }
    
    public void printPatientList() {
        patientList.stream().forEach(System.out::println);
    }

    public void printList(List list) {
        list.stream().forEach(System.out::println);
    }

    public void printDoctorsMainFocus() {
        logger.info(Doctors.CARDIOLOGIST.mainFocus());
        logger.info(Doctors.CLINICIAN.mainFocus());
        logger.info(Doctors.DERMATOLOGIST.mainFocus());
        logger.info(Doctors.PEDIATRICIAN.mainFocus());
        logger.info(Doctors.PSYCHOLOGIST.mainFocus());
        logger.info(Doctors.TRAUMATOLOGIST.mainFocus());
    }

    public int getDocCost(int i) {
        return doctorArr[i].getSalary();
    }

    public String getDocPrescription(int i) {
        return doctorArr[i].getPrescription();
    }

    public void docPrescriptions() {
        logger.info(getDocPrescription(0));
        logger.info(getDocPrescription(1));
        logger.info(getDocPrescription(2));
        logger.info(getDocPrescription(3));
        logger.info(getDocPrescription(4));
        logger.info(getDocPrescription(5));
    }

    public String getDocAvailableDays(int i) {
        return doctorArr[i].getAvailableDays();
    }

    public void docSpecialties() {
        logger.info(Doctors.CARDIOLOGIST.name());
        logger.info(Doctors.CLINICIAN.name());
        logger.info(Doctors.DERMATOLOGIST.name());
        logger.info(Doctors.PEDIATRICIAN.name());
        logger.info(Doctors.PSYCHOLOGIST.name());
        logger.info(Doctors.TRAUMATOLOGIST.name());
    }


    public void registerDate(ArrayList<Date> dateList, Date date) {
        dateList.add(date);
    }


    public void printAppointments(ArrayList<Appointment> appointmentList) {
        for (Appointment e : appointmentList) {
            logger.info(e.patient.getName() + " " + e.patient.getLastname());
            logger.info("Appointment on date: " + e.date.day + "/" + e.date.month + "/" + e.date.year);
        }
    }

    public int treatment(String annoyance, Patient patient) throws InvalidAnnoyanceException {
        Treatment trea = new Treatment();
        return trea.treat(annoyance, patient);

    }

    public void deletePatient(Human human) {
        patientList.remove(human);
    }

    //streams
    public List<Patient> filterPatientsByAge(int age) {
        return patientList.stream().filter(x -> x.age >= age).collect(Collectors.toList());
    }

    public List<String> patientListByAssignedDoctor() {
        return patientList.stream().map(x -> x.assignedDoctor).collect(Collectors.toList());

    }

    public void printPatientsByName() {
        patientList.stream().sorted((x, y) -> y.compareName(x)).forEach(System.out::println);
    }

    public long countPatients() {
        return patientList.stream().count();
    }


    public Optional<Patient> findFirstPatient() {
        return patientList.stream().findFirst();
    }


    public boolean choice(String str, Choice yesOrNo) {
        return yesOrNo.yesOrNo(str);
    }

    @Override
    public void typeOfBuilding() {
        logger.info("My time of building is Hospital");
    }


}
