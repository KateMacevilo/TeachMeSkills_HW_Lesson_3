package com.teachmeskills.lesson_3;
/**
 * Create an array and populate the array.
 * Output the array to the screen as a string.
 * Replace each element with an odd index with a zero.
 * Display the array again on a separate line.
 */

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        Random rn = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rn.nextInt(10) + 1;
        }
        System.out.println("array is full" + Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 != 0) {
                array1[i] = 0;
            }
        }

        System.out.println("new array is " + Arrays.toString(array1));
    }
}
