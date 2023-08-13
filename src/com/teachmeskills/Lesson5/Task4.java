package com.teachmeskills.Lesson5;

import java.util.Arrays;

/*
 Создайте двумерный массив. Выведите на консоль диагонали массива.
*/

public class Task4 {
    public static void main(String[] args) {
        int[][] diaArray = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[] res1 = new int[5];
        int[] res2 = new int[5];
        for(int i = 0; i < diaArray.length; i++){
            for(int j = 0; j < diaArray[0].length; j++){
                if(i == j){
                    res1[i] += diaArray[i][j];
                }
                if(i + j == diaArray.length - 1){
                    res2[i] += diaArray[i][j];
                }
            }

        }
    System.out.print(Arrays.toString(res1));
    System.out.println();
    System.out.print(Arrays.toString(res2));
    }
}
