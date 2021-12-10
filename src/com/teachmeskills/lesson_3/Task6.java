package com.teachmeskills.lesson_3;

import java.util.Arrays;

/**
 * Create an array of strings. Fill it with arbitrary names of people.
 * Sort the array.
 * Print the result on the console.
 */
public class Task6 {
    public static void main(String[] args) {
        String[] names = new String[]{"Kate", "Jane", "Ilon", "Adam", "Andrew", "Pavel"};
        Arrays.sort(names);
        System.out.println("Sort array is " + Arrays.toString(names));
    }
}
