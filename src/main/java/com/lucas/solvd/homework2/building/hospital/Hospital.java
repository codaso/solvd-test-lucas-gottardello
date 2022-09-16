package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.Date;
import com.lucas.solvd.homework2.building.Building;
import com.lucas.solvd.homework2.exceptions.InvalidAnnoyanceException;
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

    public Hospital() {
        super("");
    }

    public Hospital(String hospitalName) {
        super(hospitalName);
    }

    public void loadDoctors(Doctor[] doctorArr) {
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


    public void addPatient(LinkedList<Patient> patientList, Patient patient) {
        patientList.add(patient);
    }


    public void printPatientList(LinkedList<Patient> patientList) {
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

    public int getDocCost(Doctor[] doctorArr, int i) {
        return doctorArr[i].getSalary();
    }

    public String getDocPrescription(Doctor[] doctorArr, int i) {
        return doctorArr[i].getPrescription();
    }

    public void docPrescriptions(Doctor[] doctorArr) {
        logger.info(getDocPrescription(doctorArr, 0));
        logger.info(getDocPrescription(doctorArr, 1));
        logger.info(getDocPrescription(doctorArr, 2));
        logger.info(getDocPrescription(doctorArr, 3));
        logger.info(getDocPrescription(doctorArr, 4));
        logger.info(getDocPrescription(doctorArr, 5));
    }

    public String getDocAvailableDays(Doctor[] doctorArr, int i) {
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

    public Date searchFreeDate(ArrayList<Date> dateList) {
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

    public void registerDate(ArrayList<Date> dateList, Date date) {
        dateList.add(date);
    }

    public void registerAppointment(ArrayList<Appointment> appointmentList, Patient patient, Date date) {
        Appointment appointment = new Appointment(patient, date);
        appointmentList.add(appointment);
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

    public void deletePatient(LinkedList<Patient> patientList, Human human) {
        patientList.remove(human);
    }

    //streams
    public List<Patient> filterPatientsByAge(LinkedList<Patient> patientList, int age) {
        return patientList.stream().filter(x -> x.age >= age).collect(Collectors.toList());
    }

    public List<String> patientListByAssignedDoctor(LinkedList<Patient> patientList) {
        return patientList.stream().map(x -> x.assignedDoctor).collect(Collectors.toList());

    }

    public void printPatientsByName(LinkedList<Patient> patientList) {
        patientList.stream().sorted((x, y) -> y.compareName(x)).forEach(System.out::println);
    }

    public long countPatients(LinkedList<Patient> patientList) {
        return patientList.stream().count();
    }


    public Optional<Patient> findFirstPatient(LinkedList<Patient> patientList) {
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
