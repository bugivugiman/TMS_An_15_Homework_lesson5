package com.teachmeskills.Lesson5;
import java.util.Arrays;

/*
 Умножение двух матриц
 Создайте два массива целых чисел размером 3х3 (две матрицы).
 Напишите программу для умножения двух матриц.
 Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 Ожидаемый результат: 1 2 3 1 1 1 0 0 0
*/

public class Task2 {
    public static void main(String[] args) {
        int [][] Array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int [][] Array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int [][] resultArray = new int[Array1.length][Array2[0].length];

        for(int i = 0; i < Array1.length; i++){
            for(int j = 0; j < Array2[0].length; j++){
                for(int k = 0; k < Array1.length; k++){
                    resultArray[i][j] = resultArray[i][j] + Array1[i][k] * Array2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(resultArray));
    }
}
