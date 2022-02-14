package com.max.idea;

import java.util.Arrays;

public class Task3_1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (20 + 1) - 10);
        }
        System.out.println("Массив до: " + Arrays.toString(array));
        int max_negative = -10;
        int min_positive = 10;
        int maxInd = 0;
        int minInd = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0 && array[j] > max_negative) {
                max_negative = array[j];
                minInd = j;
            }
            if (array[j] > 0 && array[j] < min_positive) {
                min_positive = array[j];
                maxInd = j;
            }
        }
        int temp = array[minInd];
        array[minInd] = array[maxInd];
        array[maxInd] = temp;
        System.out.println("Массив после: " + Arrays.toString(array));
        System.out.println("максимальный отрицательный: " + max_negative + "\n" + "минимальный положительный: " + min_positive);
    }
}