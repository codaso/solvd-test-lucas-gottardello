package com.lucas.solvd.homework2;

import java.lang.reflect.Field;

public class FieldString {
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
