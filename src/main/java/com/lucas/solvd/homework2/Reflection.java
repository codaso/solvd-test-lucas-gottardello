package com.lucas.solvd.homework2;

import com.lucas.solvd.homework2.human.Human;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    private Logger logger = LogManager.getLogger(Reflection.class);
    static final int max = 127;


    public Field[] getFields(Object obj) {
        Field[] objField = obj.getClass().getDeclaredFields();
        if (objField.length > max) {
            logger.info("maximum number of fields permitted in Field[] is = 128");
        }
        return objField;
    }

    public String[] getFieldNames(Field[] aux) {
        //getFieldNames ->returns an array String[], with size Field[] aux.length, of String elements:
        int n = 0;
        Field field = null;
        //get size of input Field[] array, save it to n(n ∈ N ,N = {0,1,2,...,127});
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] != null) {
                n++;
            } else if (aux[i] == null) {
                i = max;
            }
        }
        //create array of size n, return array of field.getName();
        String[] strArr = new String[n];
        for (int j = 0; j < n; j++) {
            if (aux[j] != null) {
                field = aux[j];
                strArr[j] = field.getName();
            } else if (aux[j] == null) {
                j = n;
            }
        }
        return strArr;
    }

    public FieldString[] getFieldStringArr(Field[] field_arr, String[] str_arr) {
        //returns an array of FieldString<Field,String>
        FieldString[] fieldStringArr = new FieldString[str_arr.length];
        for (int k = 0; k < str_arr.length; k++) {
            FieldString fieldString = new FieldString();
            fieldString.field = field_arr[k];
            fieldString.string = str_arr[k];
            fieldStringArr[k] = fieldString;
        }
        return fieldStringArr;
    }

    public FieldString[] arrayOfField_String(Object x) {
        Field[] field_arr = getFields(x);
        String[] str_arr = getFieldNames(field_arr);
        return getFieldStringArr(field_arr, str_arr);
    }

    public Method[] getMethods(Object obj) {
        Method[] objMethods = obj.getClass().getMethods();
        return objMethods;
    }

    public void printMethodReturnType(Object x) {
        Method[] methods = getMethods(x);
        for (Method method : methods) {
            logger.info("Method name: " + method);
            logger.info("Return type: " + method.getReturnType());

        }
    }

    public static void main(String[] args) {


        Reflection reflection = new Reflection();
        Human x = new Human();
        Field[] fields = reflection.getFields(x);
        String[] names = reflection.getFieldNames(fields);
        FieldString[] field_and_names = reflection.arrayOfField_String(x);
        for (FieldString fieldString : field_and_names) {
            System.out.println(fieldString);
        }


    }
}
