package com.teachmeskills.lesson_3;

import java.util.Arrays;

/**
 * Create 2 arrays of 5 numbers.
 * 	Output the arrays to the console in two separate lines.
 * 	Calculate the arithmetic mean of the elements of each array and report for which of the arrays the value is greater than
 * 	(or report that their arithmetic averages are equal)
 */
public class Task4 {
    public static void main(String[] args) {
        int[] mass1 = new int[5];
        int[] mass2 = new int[5];
        introduceMassive(mass1);
        introduceMassive(mass2);

        System.out.println("massive 1 = "+ Arrays.toString(mass1));
        System.out.println("massive 2 = "+ Arrays.toString(mass2));
        float mediumMass1 = calculate(mass1);
        float mediumMass2 = calculate(mass2);
        System.out.println("The arithmetic mean of the first array = "+ mediumMass1);
        System.out.println("The arithmetic mean of the second array = "+ mediumMass2);

        if (mediumMass1 < mediumMass2) {
            System.out.println("The arithmetic mean of the second array is greater than the first");
        } else if (mediumMass2 < mediumMass1) {
            System.out.println("The arithmetic mean of the first array is greater than the second");
        } else if (mediumMass2 == mediumMass1){
            System.out.println("The arithmetic mean of the two arrays are the same");
        }
    }

    static void introduceMassive (int [] mass){
        for(int i = 0; i < mass.length; i++){
            mass[i] = (int) (Math.random()*11);
        }
    }

    static float calculate (int [] mass){
        int summ = 0;
        float medium = 0.0f;
        for(int i = 0; i < mass.length; i++){
            summ += mass[i];
        }
        medium = (float) summ / mass.length;
        return medium;

    }
}
