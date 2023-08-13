package com.teachmeskills.Lesson5;

/*
 Шахматная доска
 Создать программу для раскраски шахматной доски с помощью цикла.
 Создать двумерный массив String'ов 8х8. С помощью циклов задать
 элементам циклам значения B(Black) или W(White). Результат работы
 программы:
	W B W B W B W B
	B W B W B W B W
	W B W B W B W B
	B W B W B W B W
	W B W B W B W B
	B W B W B W B W
	W B W B W B W B
	B W B W B W B W
*/

public class Task1 {
    public static void main(String[] args) {
        String[][] board = new String[8][8];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(j%2 == 0){
                    if(i%2 == 0){
                        board[i][j] = "W";
                    }
                    else{
                        board[i][j] = "B";
                    }
                }
                else{
                    if(i%2 == 0){
                        board[i][j] = "B";
                    }
                    else{
                        board[i][j] = "W";
                    }
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
