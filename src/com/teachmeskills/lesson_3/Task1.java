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
        System.out.println("array is full" + Arrays.toString(mass));

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int count = 0; //the number of matches of the entered number
        boolean numbIn = false;

        for (int i = 0; i < mass.length; i++) {
            if (numb == mass[i]) {
                count++;
                numbIn = true;
            }
        }
        System.out.println("count " + count);

        int l = mass.length - count; //size of new array
        int[] array2 = new int[l];
        int n = 0; ////second array index

        for (int i = 0; i < mass.length; i++) {
            if ((mass[i] != numb) && (n < l)) {
                array2[n] = mass[i];
                n++;
            }
        }

        if (numbIn) {
            System.out.println("The number " + numb + " deleted from array. The new array is " + Arrays.toString(array2));
        } else {
            System.out.println("The number " + numb + " doesn't exist in array");
        }

    }

}

