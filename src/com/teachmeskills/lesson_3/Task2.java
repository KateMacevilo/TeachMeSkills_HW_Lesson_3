package com.teachmeskills.lesson_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create and fill an array with a random number and display the maximum, minimum, and average values.
 * 	Use the Math.random() method to generate a random number.
 * 	Let it be possible to create an array of arbitrary size.
 * 	Let the size of the array be entered from the console.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Introduce the size of array: ");
        Scanner scanner = new Scanner(System.in);
        int sizeMassive = scanner.nextInt();
        int[] mass = new int[sizeMassive];

        for(int i = 0; i < mass.length; i++){
            // Math.random() возвращает случайное double значение с положительным знаком в диапазоне
            // больше или равно 0.0 и меньше 1.0 (0.0 <= Math.random() < 1.0).
            mass[i] = (int) (Math.random()*11); //
        }
        System.out.println("array = "+ Arrays.toString(mass));

        int max = 0;
        int min = 0;
        float medium = 0.0f;

        Arrays.sort(mass);
        max = mass[mass.length-1];
        min = mass[0];
        int sum = 0;
        for(int i = 0; i < mass.length; i++){
            sum += mass[i];
        }

        medium = (float) sum / mass.length;
        System.out.println("max = "+ max +" "+ "medium = " + medium +" "+ "minimum = "+ min);
    }
}
