package com.lucas.solvd.homework2;

import com.lucas.solvd.homework2.human.doctor.Doctor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Method;

public class Reflection {


    public static void main(String[] args) throws Exception {
        Logger logger = LogManager.getLogger(Reflection.class);
        Doctor doctor = new Doctor();

        //fields
        /*
        Field[] doctorField = doctor.getClass().getDeclaredFields();
        Arrays.stream(doctorField).forEach(System.out::println);
        for (Field field : doctorField) {
            logger.info(field.getName());
        }
        for (Field field : doctorField) {
            if (field.getName().equals("salary")) {
                field.setAccessible(true);
                field.set(doctor, 1500);
            }
        }
        logger.info(doctor.getSalary());

         */

        //methods

        Method[] docMethods = doctor.getClass().getMethods();
         /*
        for (Method method : docMethods) {
            logger.info(method.getName());
        }

         */
        for (Method method : docMethods) {
            System.out.println(method.getName());
            /*
            if (method.getName().equals("iAmTheDoctor")) {
                method.setAccessible(true);
                method.invoke(doctor);
            }

             */

        }

    }

}
