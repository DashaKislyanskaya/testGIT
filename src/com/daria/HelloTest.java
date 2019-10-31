package com.daria;

import java.util.Scanner;

public class HelloTest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
      int  a = in.nextInt();
                
        System.out.print("Введите количество столбцов массива: ");
      int  b = in.nextInt();
       
//создание матрицы и заполнение ее случайными числами
      
		int[][] matrix = new int[a][b];

		for (int i = 0; i < matrix.length; i++) {
			for (int j=0;j < matrix[i].length;j++){
			      matrix[i][j]=(int)(Math.random()*9+1);
			      }
		}
		
		for (int i=0;i < matrix.length;i++){
			for (int j=0;j < matrix[i].length;j++){
			System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
//поворот матрицы на 90 градусов		
		int[][] resultmatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               resultmatrix[j][matrix.length - i - 1] = matrix[i][j];
            }
        }
        
        for (int i = 0; i < resultmatrix.length; i++) {
			for (int j = 0; j < resultmatrix[i].length; j++) {
				System.out.print(resultmatrix[i][j] + " ");
			}
			System.out.println();
		}
        System.out.println();
 
//поворот матрицы на 180 градусов       
        int[][] result1matrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               result1matrix[matrix.length - i - 1][matrix.length - j-1] = matrix[i][j];
            }
        }
        
        for (int i = 0; i < result1matrix.length; i++) {
			for (int j = 0; j < result1matrix[i].length; j++) {
				System.out.print(result1matrix[i][j] + " ");
			}
			System.out.println();
		}
        
        System.out.println();
 
 //поворот матрицы на 270 градусов
        int[][] result2matrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               result2matrix[matrix.length - j - 1][i] = matrix[i][j];
            }
        }
        
        for (int i = 0; i < result2matrix.length; i++) {
			for (int j = 0; j < result2matrix[i].length; j++) {
				System.out.print(result2matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
