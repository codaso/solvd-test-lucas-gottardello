package com.lucas;

public class Tasks {


    static int[] array_min_and_max(int[] arg){
            int min =0;
            int max =0;
            for ( int i=0; i<arg.length ;i++ ){
                if (arg[i]< min){
                    min = arg[i];
                }
                if (arg[i] > max){
                    max = arg[i];
                }
            }
            arg[0]=min;
            arg[1]=max;
            return arg;
    }


    static void task1(){
        //task_1
        System.out.println("Something");
        int[] my_array = {3,4,5};
        int a = my_array[0];
        System.out.println(a);

    }

    static void task2(){
        //task_2
        int [] array = {3, 7, 6, 13, 33, 9, -100, 25};
        int i = 0;
        boolean print_once = true;
        while ( i < array.length){
            System.out.println(array[i]);
            i++;
             if (print_once){
                array_min_and_max(array);
                System.out.println("Smallest array2 value is: " + array[0]);
                System.out.println("Biggest array2 value is: " + array[1]);
                print_once = false;
            }
        }

    }
    static void task3(){
        //task_3
        int [] array_to_sort = {3, 7, 6, 13, 33, 9, -100, 25};
        InsertionSort(array_to_sort);
        for (int j =0;j<array_to_sort.length;j++){
            System.out.println(array_to_sort[j]);
        }
    }

    static void InsertionSort(int[] array){

        int aux;
        for (int i=1;i<array.length;i++){
            int j = i;
            while (j>0){

                if (array[j] < array[j-1]){
                    aux=array[j];
                    array[j]=array[j-1];
                    array[j-1]=aux;
                }
                j=j-1;
            }

        }
    }




    public static void main(String[] args ) {
        task1();
        task2();
        task3();
    }
}
