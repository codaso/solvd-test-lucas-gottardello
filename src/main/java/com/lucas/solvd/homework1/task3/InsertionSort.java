package com.lucas.solvd.homework1.task3;

public class InsertionSort {

    public static void insertionSort(String[] strArr) {
        _insertionSort(strArr);
        for (int j = 0; j < strArr.length; j++) {
        }
    }

    static void _insertionSort(String[] array) {
        String aux;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0) {
                if (array[j].compareTo(array[j - 1]) < 0) {
                    aux = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = aux;
                }
                j = j - 1;
            }
        }
    }
}
