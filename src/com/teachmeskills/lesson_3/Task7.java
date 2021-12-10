package com.teachmeskills.lesson_3;

import java.util.Arrays;
import java.util.Random;

/**
 * Implement the bubble sorting algorithm.
 */
public class Task7 {
    public static void main(String[] args) {
        int[] array1 = new int[6];
        Random rn = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rn.nextInt(10) + 1;
        }
        System.out.println("1st array - " + Arrays.toString(array1));

        boolean sort = false;
        int n = 0;
        while (!sort) {
            sort = true;
            for (int i = 0; i < array1.length; i++) {
                if ((i != array1.length - 1) && (array1[i + 1] < array1[i])) {
                    n = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = n;
                    sort = false;
                }
            }
            System.out.println(Arrays.toString(array1));
        }
    }
}
