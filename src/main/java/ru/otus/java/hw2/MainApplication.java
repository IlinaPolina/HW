package ru.otus.java.hw2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int counter = 0;
        while (counter < 5) {
            System.out.println("Печать строки n раз");
            counter++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Печать строки i раз");
        }
        System.out.println("Задание 2");
        sumArr();
        System.out.println("Задание 3");
        arrNumbers();
        System.out.println("Задание 4");
        arrPlus();
        System.out.println("Задание 5");
        arrPastSum();

    }

    public static void sumArr() {
        int[] arr = {6, 8, 3, 4, 5, 9, 7, 8, 1, 2};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);

    }

    public static void arrNumbers() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 7;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrPlus() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) ;
            {
                arr[i] += 3;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrPastSum() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length/2) {
                sum += arr[i];
            }
            else {
                sum +=arr [i];
            }
        }
        System.out.println(sum + " = " + "Суммa половины с большей суммой");
    }

}
