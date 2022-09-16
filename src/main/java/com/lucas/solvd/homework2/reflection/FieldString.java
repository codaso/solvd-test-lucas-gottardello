package com.lucas.solvd.homework2.reflection;

import java.lang.reflect.Field;

public class FieldString {
    //class used in class Reflection
    public Field field;
    public String string;

    public FieldString() {
        this.field = null;
        this.string = null;
    }

    @Override
    public String toString() {
        return "field = " + this.field + ", string = " + this.string;
    }
}
