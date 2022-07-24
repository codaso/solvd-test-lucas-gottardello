package com.lucas.solvd.task2;

public class Main2 {
    static void Task_2(){
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

    public static void main(String[] args) {

        Task_2();
    }
}
