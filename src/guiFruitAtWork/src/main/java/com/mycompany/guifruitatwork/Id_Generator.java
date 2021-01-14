package com.mycompany.guifruitatwork;
import org.apache.commons.lang3.RandomStringUtils;


public class Id_Generator {

    public static String generator(int length){
        // all possible unicode characters
        var shortId = RandomStringUtils.random(length, 0, 20, true, true, "qw32rfHIJk9iQ8Ud7h0X".toCharArray());
        return shortId;
    }
    public static void main(String[] args) {
        System.out.println(generator(2));
    }
}











