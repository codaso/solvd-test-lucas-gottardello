package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework1.task3.InsertionSort;
import com.lucas.solvd.homework2.FieldString;
import com.lucas.solvd.homework2.Reflection;
import com.lucas.solvd.homework2.human.Human;
import com.lucas.solvd.homework2.human.patient.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OffMenu {
    Hospital hospital = new Hospital("");
    Scanner userInput_Option = new Scanner(System.in);
    private Logger logger = LogManager.getLogger(OffMenu.class);


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
                    " \n 9) Reflection menu" +
                    " \n 10) Exit");
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
                    logger.info("Enter an int number to lower bound users age: ");
                    int a = userInput_Option.nextInt();
                    List<Patient> listByAge = hospital.filterPatientsByAge(a);
                    hospital.printList(listByAge);
                    break;
                }
                case 4: {
                    long c = hospital.countPatients();
                    logger.info("Number of patients: " + c);
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
                case 8: {
                    hospital.printPatientList();
                    break;
                }
                case 9: {
                    boolean option9 = true;
                    while (option9) {
                        logger.info("Reflection: " + "\n" +
                                "1) Print elements of FieldString[] array of class Human\n" +
                                "2) Print methods of class Human\n" +
                                "3) Print Sorted names of fields of class Human\n" +
                                "4) Print methods return type of class Human\n" +
                                "5) Exit\n");
                        int option_reflection = userInput_Option.nextInt();
                        Human h = new Human();
                        Reflection reflection = new Reflection();
                        switch (option_reflection) {
                            case 1: {
                                FieldString[] fieldStrings = reflection.arrayOfField_String(h);
                                for (FieldString fieldString : fieldStrings) {
                                    logger.info(fieldString);
                                }
                                break;
                            }
                            case 2: {
                                Method[] metohds = reflection.getMethods(h);
                                for (Method method : metohds) {
                                    logger.info(method);
                                }
                                break;
                            }
                            case 3: {
                                Field[] fields = reflection.getFields(h);
                                String[] str_arr = reflection.getFieldNames(fields);
                                InsertionSort.insertionSort(str_arr);
                                for (String str : str_arr) {
                                    logger.info(str);
                                }
                                break;
                            }
                            case 4: {
                                reflection.printMethodReturnType(h);
                                break;
                            }
                            case 5: {
                                option9 = false;
                                break;
                            }
                            default:
                                option9 = false;
                                break;
                        }
                    }
                }

                case 10: {
                    offMen = false;
                    break;
                }
                default: {
                    offMen = false;
                    break;
                }
            }
        }
    }


}
