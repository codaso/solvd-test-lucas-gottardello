package com.lucas.solvd.homework3;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;

public class Runner {


    public static void main(String[] args) throws IOException {
        File originalFile = new File("src/main/java/com.lucas.solvd/fileshomework/myname.txt");
        FileUtils.touch(originalFile);
        if (originalFile.exists()) {
            System.out.println("originalFile exists");
        } else {
            System.out.println("file doesn't exist");
        }
        FileUtils.deleteQuietly(originalFile);
        if (originalFile.exists()) {
            System.out.println("originalFile exists");
        } else {
            System.out.println("file doesn't exist");
        }
        File newFile = new File("src/main/resources/text0.txt");
        System.out.println(newFile.exists());

        String string = "";
        //FileUtils.readFileToString(newFile, string);
        //System.out.println(string);

        String a = "hello";
        String b = "hello";
        System.out.println(StringUtils.equals(a, b));

    }

}
