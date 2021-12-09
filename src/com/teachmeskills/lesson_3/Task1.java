package com.teachmeskills.lesson_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Create an array of integers. Remove all occurrences of a given number from the array.
 * Let the number be given from the console (Scanner class).
 * If there is no such number, print messages about it.
 * The result should be a new array without the specified number.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random rn = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rn.nextInt(10) + 1;
        }
        System.out.println("massive is full" + Arrays.toString(mass));

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        boolean numbIn = false;

        for (int i = 0; i < mass.length; i++) {
            if (numb == mass[i]) {
                mass[i] = 0;
                numbIn = true;
            }
        }


        if (numbIn) {
            System.out.println("The number " + numb + " deleted from massive. The new massive is " + Arrays.toString(mass));
        } else {
            System.out.println("The number " + numb + " doesn't exist in massive");
        }

    }

}

