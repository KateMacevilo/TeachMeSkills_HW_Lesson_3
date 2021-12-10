package com.teachmeskills.lesson_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Create an array of n random integers and display it on the screen.
 * Let the size of the array be set from the console and the size of the array
 * can be greater than 5 and less than or equal to 10.
 * If the user entered a wrong number, print a message about it and ask the user to enter it again.
 * Create a second array only from even elements of the first array, if there are any, and display it.
 */
public class Task4 {
    public static void main(String[] args) {

        System.out.println("Introduce a size of array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean result = true;
        Random rn = new Random();

        while (result) {
            if ((n > 5) && (n <= 10)) {
                int[] array1 = new int[n];

                for (int i = 0; i < array1.length; i++) {
                    array1[i] = rn.nextInt(10) + 1;
                }
                result = false;
                System.out.println(Arrays.toString(array1));

                int c = 0; //number of even numbers
                for (int i = 0; i < array1.length; i++) {
                    if (array1[i] % 2 == 0) {
                        c++;
                    }
                }
                System.out.println("c = " + c);


                int nn = 0; //second array index
                int[] array2 = new int[c];
                for (int i = 0; i < array1.length; i++) {
                    if ((array1[i] % 2 == 0) && (nn < c)) {
                        array2[nn] = array1[i];
                        nn++;
                    }
                }

                System.out.println("new array is " + Arrays.toString(array2));

            } else {
                System.out.println("introduce a number from 5 to 10: ");
                n = scanner.nextInt();
            }
        }
        System.out.println("end");
    }
}
