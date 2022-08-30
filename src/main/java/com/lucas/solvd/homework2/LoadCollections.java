package com.lucas.solvd.homework2;

import com.lucas.solvd.homework2.human.patient.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Stream;

public class LoadCollections {
    Logger logger = LogManager.getLogger(LoadCollections.class);

    Patient patient1 = new Patient("patient1", "one", "male", 10);
    Patient patient2 = new Patient("patient2", "two", "female", 15);
    Patient patient3 = new Patient("patient3", "three", "male", 20);
    Patient patient4 = new Patient("patient4", "four", "female", 25);
    Patient patient5 = new Patient("patient5", "five", "female", 30);
    Patient patient6 = new Patient("patient6", "six", "male", 35);

    LinkedList<Patient> list = new LinkedList();


    Collection<Patient> collection = Arrays.asList(patient1, patient2, patient3, patient4, patient5, patient6);
    Stream<Patient> streamOfCollection = collection.stream();

    public void filter() {
        collection.stream().filter(x -> x.age > 20).forEach(System.out::println);
    }

    public void sort() {
        collection.stream().sorted((x, y) -> y.compareName(x)).forEach(System.out::println);
    }

    public void transform() {

    }

    //terminal operations
    public long count() {
        return collection.stream().count();
    }

    public Optional<Patient> findFirst() {
        return collection.stream().findFirst();
    }


    public static void main(String[] args) {
        LoadCollections a = new LoadCollections();
        a.sort();
    }
}
