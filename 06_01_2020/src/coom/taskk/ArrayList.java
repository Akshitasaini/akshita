package coom.taskk;

import java.util.Scanner;

public class ArrayList {
	int arr1[][] = new int [5][5];
	int arr2[][] = new int [5][5];
	int arr3[][]=  new int [5][5];
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter number of rows:");
	int row = sc.nextInt();
	System.out.print("enter number of columns:");
	int column = sc.nextInt();
	int[][] matrix = new  int [row][column];
	 enterMatrixData(sc, matrix, row, column);
	 printMatrix(matrix, row, column);


}
		 public static void enterMatrixData(Scanner sc, int[][] matrix, int row, int column){
		     System.out.println("Enter Matrix Data");
		          
		          for (int i = 0; i < row; i++)
		          {
		              for (int j = 0; j < column; j++)
		              {
		                  matrix[i][j] = sc.nextInt();
		              }
	 }
		 }
		          public static void printMatrix(int[][] matrix, int row, int column){
		        	    System.out.println("Your Matrix is : ");
		        	        
		        	        for (int i = 0; i < row; i++)
		        	        {
		        	            for (int j = 0; j < column; j++)
		        	            {
		        	                System.out.print(matrix[i][j]+"\t");
		        	            }
		        	             
		        	            System.out.println();
            
		}
		          }

}
		 