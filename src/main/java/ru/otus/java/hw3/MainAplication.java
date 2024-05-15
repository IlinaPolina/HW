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
        zeroDiagonals(new int[][]{{6, 8, 9, 6, 7, 3}, {9, 9, 9, 9, 9, 9}, {9, 7, 9, 8, 8, 8}, {9, 7, 9, 8, 8, 8}, {9, 7, 9, 8, 8, 8}, {9, 7, 9, 8, 8, 8}});
        System.out.println("Задание 4");
        findMax(new int[][]{{6, 8, 9, 7, 6, 4, 3, 1, 2, 123}, {9, 0, 9, 0, 9, 7, 4, 5, 777}});
        System.out.println("Задание 5");
        sumOfSecondLine(new int[][]{{6, 9, 7}, {9, 1, 1}, {7, 5, 6}});
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

    private static void zeroDiagonals(int array2d[][]) {
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (i == j) {
                    array2d[i][j] = 0;
                }
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void findMax(int[][] array2d) {
        int max = array2d[0][0];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (array2d[i][j] > max) ;
                max = array2d[i][j];
            }
            System.out.println(max);
        }
    }

    private static void sumOfSecondLine(int[][] array2d) {
        int sum = 0;
        int lineNumber = 1;
        for (int i = 0; i < array2d.length; i++)
            sum+=array2d[lineNumber][i];{
            for (int j = 0; j < array2d[0].length; j++) {
            }
            System.out.println(sum);
        }
    }
}
