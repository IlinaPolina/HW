package ru.otus.java.hw3;

public class MainAplication {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        sumOfPositiveElements(new int[][]{{6, 8, 9, 7, 6, 4, 3, 1, 2, 6}, {9, 0, 9, 0, 6, 7, 4, 5, 6}});
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
}
