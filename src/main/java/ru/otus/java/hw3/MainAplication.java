package ru.otus.java.hw3;

import java.util.Arrays;

public class MainAplication {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        sumOfPositiveElements(new int[][]{{6, 8, 9, 7, 6, 4, 3, 1, 2, 6}, {9, 0, 9, 0, 6, 7, 4, 5, 6}});
        System.out.println();
        System.out.println("Задание 2");
        //squareOfStars();
        squareOfStars2(4, 4);
        System.out.println("Задание 3");
        zeroDiagonals();
    }


    public static int sumOfPositiveElements(int array2d[][]) {
        int sum = 0;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d.length; j++) {
                if (array2d[i][j] > 0)
                    System.out.print(array2d[i][j]);
            }
        }
        return sum;
    }

//    public static void squareOfStars() {
//        char [][] array2d = new char[5][5];
//        for (int i = 0; i < array2d.length; i++) {
//            for (int j = 0; j < array2d[i].length; j++)
//                array2d [i][j] = '*';
//        }
//        System.out.println(array2d);
//    }

    public static void squareOfStars2(int rows, int coloms) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloms; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void zeroDiagonals() {
        int [][] array2d = new int [6][6];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (i == j) {
                    array2d[i][j] = 7;
                }
                System.out.println(array2d[i][j] + "");
            }
        }
        System.out.println();
    }
}
