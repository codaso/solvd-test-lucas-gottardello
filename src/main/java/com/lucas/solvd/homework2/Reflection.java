package com.lucas.solvd.homework2;

import com.lucas.solvd.homework2.human.Human;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {


    public void getMethodNames() throws ClassNotFoundException {
        //returns array of Method for a given String
        Class<?> aClass = Class.forName("com.lucas.solvd.homework2.Reflection");
    }

    public Field[] getFields(Object obj) {
        Field[] objField = obj.getClass().getDeclaredFields();
        return objField;
    }


    public Method searchInMthdArr(Method[] arr, String str) {
        //returns pointer to a Method element in the given array
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])) return arr[i];
        }
        return null;
    }

    public String[] getFieldNames(Field[] aux) {
        //getFieldNames ->returns an array String[], with size Field[] aux.length, of String elements:
        int n = 0;
        final int max = 127;
        String[] strArr = new String[n];
        Field field = null;
        //get size of input Field[] array, save it to n(n ∈ N ,N = {0,1,2,...,127});
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] != null) {
                n++;
            } else if (aux[i] == null) {
                i = max;
            }
        }
        System.out.println(n);
        //create array of size n, return array of field.getName();
        String[] strArr2 = new String[n];
        for (int j = 0; j < n; j++) {
            if (aux[j] != null) {
                field = aux[j];
                strArr2[j] = field.getName();
            } else if (aux[j] == null) {
                j = n;
            }
        }
        return strArr2;
    }

    public Object humanObj(Field[] fields, String str) {
        for (Field field : fields) {
            if (field.getName().equals("Human")) {
                System.out.println("its equal");
                return field;
            }

        }
        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException {

        Reflection reflection = new Reflection();
        Human x = new Human();

        //Doctor x = new Doctor();
        Field[] aux = reflection.getFields(x);


        for (Field field : aux) {
            System.out.println(field);
        }
        String[] str_arr = reflection.getFieldNames(aux);
        for (String str : str_arr) {
            System.out.println(str);
        }


        Object o = reflection.humanObj(aux, x.toString());
        System.out.println(o);


        //Method met = reflection.searchInMthdArr(arr, "Doctor");
        //System.out.println(met.getName());
    }
}
