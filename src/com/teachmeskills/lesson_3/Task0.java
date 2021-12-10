package com.teachmeskills.lesson_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Create an array of integers. Write a program that outputs a message
 * saying whether the given number is included in the array or not.
 * Let the number to search for be given from the console (Scanner class).
 */
public class Task0 {

    public static void main(String[] args) {

        int[] values = new int[10];
        Random rn = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = rn.nextInt(10) + 1;
        }
        System.out.println("array is full" + Arrays.toString(values));

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();

        if (getTrue(values, numb)) {
            System.out.println("The number " + numb + " exists in array");
        } else {
            System.out.println("The number " + numb + " doesn't exist in array");
        }

    }

    static boolean getTrue(int[] mass, int n) {
        for (int i = 0; i < mass.length; i++) {
            if (n == mass[i]) {
                return true;
            }
        }
        return false;
    }
}

