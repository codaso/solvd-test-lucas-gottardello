package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.Date;
import com.lucas.solvd.homework2.human.Injury;
import com.lucas.solvd.homework2.human.Patient;

public interface IHospital {

    void registerPatient(Patient patient);


    boolean instantTreatment(Injury injury);

    //int assignedDoctorCost(String annoyance);

    boolean searchDate(Date date);
}
