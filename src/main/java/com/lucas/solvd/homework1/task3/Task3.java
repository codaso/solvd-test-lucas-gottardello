package com.lucas.solvd.homework1.task3;

public class Task3 {
    static void insertioSort() {
        //task_3
        int[] array_to_sort = {3, 7, 6, 13, 33, 9, -100, 25};
        InsertionSort(array_to_sort);
        for (int j = 0; j < array_to_sort.length; j++) {
            System.out.println(array_to_sort[j]);
        }
    }

    static void InsertionSort(int[] array) {

        int aux;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0) {
                if (array[j] < array[j - 1]) {
                    aux = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = aux;
                }
                j = j - 1;
            }

        }
    }

    public static void main(String[] args) {

        insertioSort();
    }
}
