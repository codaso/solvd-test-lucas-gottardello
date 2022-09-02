package com.lucas.solvd.homework2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
    //information class
    public static void main(String[] args) {
        System.out.println(process("Hello World", str -> str.toUpperCase()));
        System.out.println(process2("World Hello", str -> str.toUpperCase()));
        System.out.println(process3("Hola Mundo", 5, (str, i) -> str.substring(i)));
    }

    static String process(String str, Processor processor) {
        return processor.process(str);
    }

    static String process2(String str, Function<String, String> processor) {
        return processor.apply(str);
    }

    static String process3(String str, int i, BiFunction<String, Integer, String> processor) {
        return processor.apply(str, i);
    }

    interface Processor {
        String process(String str);
    }
}
