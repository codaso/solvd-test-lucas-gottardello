package com.lucas.solvd.task2;

public class Main2 {
    static void Task_2(){
        int [] array = {3, 7, 6, 13, 33, 9, -100, 25};
        int i = 0;
        //print array
        while ( i < array.length){
            System.out.println(array[i]);
            i++;
        }
        array_min_and_max(array);
        //print array min value and max value
        System.out.println("Smallest array value is: " + array[0]);
        System.out.println("Biggest array value is: " + array[1]);

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
