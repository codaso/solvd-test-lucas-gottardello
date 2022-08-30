package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.human.patient.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OffMenu {
    Hospital hospital = new Hospital("");
    Scanner userInput_Option = new Scanner(System.in);
    private static Logger logger = LogManager.getLogger(OffMenu.class);


    public void Off_Menu() {
        boolean offMen = true;
        while (offMen) {
            logger.info("Select the method you want to run or exit off-menu");
            logger.info("\n 1) Print patients by name" +
                    "  \n 2) Print patients by assigned doctor" +
                    " \n 3) Print patients by age" +
                    " \n 4) Count patients" +
                    " \n 5) Find the first patient on the list" +
                    " \n 6) Doctor prescriptions" +
                    " \n 7) Doctor specialties available" +
                    " \n 8) Print patient list" +
                    " \n 9) Exit");
            int option = userInput_Option.nextInt();
            switch (option) {
                case 1: {
                    hospital.printPatientsByName();
                    break;
                }
                case 2: {
                    List<String> listByAssignedDoctor = hospital.patientListByAssignedDoctor();
                    hospital.printList(listByAssignedDoctor);
                    break;
                }
                case 3: {
                    List<Patient> listByAge = hospital.filterPatientsByAge(20);
                    hospital.printList(listByAge);
                    break;
                }
                case 4: {
                    long c = hospital.countPatients();
                    logger.info(c);
                    break;
                }
                case 5: {
                    Optional p = hospital.findFirstPatient();
                    logger.info(p);
                    break;
                }
                case 6: {
                    hospital.docPrescriptions();
                    break;
                }
                case 7: {
                    hospital.docSpecialties();
                    break;
                }
                case 9: {
                    hospital.printPatientList();
                }
                default: {
                    offMen = false;
                    break;
                }
            }
        }
    }


}
