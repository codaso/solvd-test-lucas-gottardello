package com.lucas.solvd.homework3;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FileAndStrings {
    public static void main(String[] args) throws IOException {
        //FileUtils methods usage
        File fileIn = new File("src/main/resources/text0.txt");
        File fileOut = new File("src/main/resources/text02.txt");
        FileUtils.copyFile(fileIn, fileOut);
        FileUtils.touch(fileOut);
        System.out.println(FileUtils.contentEquals(fileIn, fileOut));
        System.out.println(FileUtils.sizeOf(fileIn));
        FileUtils.delete(fileOut);

        //StringUtils methods usage
        /*
        String space = StringUtils.SPACE;
        System.out.println("Java" + space + "is great");
        String lineJump = StringUtils.LF;
        System.out.println("Java" + lineJump + "is great");
        //abbreviate
        String language = "Java is a programming language";
        System.out.println(StringUtils.abbreviate(language, 7));
        //capitalize
        language = "java is object oriented";
        System.out.println(StringUtils.capitalize(language));
        //count matches
        language = "Java is great. Java is flabbergasting";
        System.out.println(StringUtils.countMatches(language, "is"));
        //retrieve digits of string
        language = "Java 8. Java 9. Java 11. Java 12";
        System.out.println(StringUtils.getDigits(language));
        System.out.println(language.toLowerCase(Locale.ROOT));
        System.out.println(StringUtils.isBlank(language));

         */
        //count unique words in a file
        String content = FileUtils.readFileToString(fileIn, "UTF-8");
        HashMap<String, Integer> map = new HashMap<>();
        String words[] = StringUtils.split(content);

        for (String word : words) {
            int cont = 0;
            if (map.containsKey(word)) {
                cont = (int) map.get(word) + 1;
                map.put(word, cont);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}
