package algorithms;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		//int a[][] = {{11,12,13,14}, {21,22,23,24}, {31,32,33,34}, {41,42,43,44}};
		int rows=4,columns=4;
		int i=0,j=0;
		
		Integer[][] a = new Integer[rows][rows];
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter the size of the matrix");
		rows=scanner.nextInt();
		scanner.nextLine();
		
		columns = rows;
	
		for(i=0;i<rows;i++){
			System.out.println("Enter the row values");
			String[] row = scanner.nextLine().split(" ");
			for(j=0;j<rows;j++){
				a[i][j] = Integer.parseInt(row[j]);
			}
		}		
		
		for(i=0;i<rows;i++){
			for(j=0;j<columns;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		for(i=0;i<rows/2;i++)
		{
			for(j=i;j<rows-1-i;j++){
				
				a[i][j] = a[i][j] + a[rows-1-j][i] + a[rows-1-i][rows-1-j] + a[j][rows-1-i];
				a[rows-1-j][i] = a[i][j] - a[rows-1-j][i] - a[rows-1-i][rows-1-j] - a[j][rows-1-i];
				a[rows-1-i][rows-1-j] = a[i][j] - a[rows-1-j][i] - a[rows-1-i][rows-1-j] - a[j][rows-1-i];
				a[j][rows-1-i] = a[i][j] - a[rows-1-j][i] - a[rows-1-i][rows-1-j] - a[j][rows-1-i];
				a[i][j] = a[i][j] - a[rows-1-j][i] - a[rows-1-i][rows-1-j] - a[j][rows-1-i];
			}
		}
		
		System.out.println("After rotation");
		
		for(i=0;i<rows;i++){
			for(j=0;j<columns;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();

	}

}
