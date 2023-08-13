package com.teachmeskills.Lesson5;

/*
 Создайте двумерный массив целых чисел. Выведите на консоль сумму
 всех элементов массива.
*/


public class Task3 {
    public static void main(String[] args) {
        int[][] NumArray = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11}};
        int SumArray = 0;
        for(int[] i: NumArray){
            for(int j: i){
                SumArray += j;
            }
        }
        System.out.println("result: " + SumArray);
    }
}
