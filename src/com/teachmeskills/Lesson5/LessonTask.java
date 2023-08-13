package com.teachmeskills.Lesson5;

/*
 Создать трехмерный массив из целых чисел.
 С помощью циклов "пройти" по всему массиву и увеличить каждый
 элемент на заданное число. Пусть число, на которое будет
 увеличиваться каждый элемент, задается из консоли.
*/

import java.util.Scanner;

public class LessonTask {
    public static void main(String[] args) {
        int[][][] dataArray = {{{3, 4, 5}, {6, 7, 8}, {9, 10, 11}}};
        System.out.print("enter number for rise up current massive: ");
        Scanner scR = new Scanner(System.in);
        int numberRise = scR.nextInt();

        for(int i = 0; i < dataArray.length; i++){
            for(int j = 0; j < dataArray[i].length; j++){
                for(int k = 0; k < dataArray[i][j].length; k++){
                    dataArray[i][j][k] += numberRise;
                    System.out.print(dataArray[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
