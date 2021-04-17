package Arrays;

import java.util.Scanner;

public class SpiralAnticlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc= new Scanner(System.in);
	        int n= sc.nextInt();
	        int m= sc.nextInt();
	        int arr[][]= new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                arr[i][j]= sc.nextInt();
	            }
	        }
	        spiral(arr);
	        System.out.print("END");

	}
	public static void spiral (int[][] a) {
	
		int minRow=0;
		int maxRow= a.length;
		int minCol=0;
		int maxCol= a[0].length;

        int i;
 
        while ( minRow < maxRow && minCol < maxCol) {
            // Print the first row from the remaining rows
            for (i = minCol; i < maxCol; ++i) {
                System.out.print(a[minRow][i] + ", ");
            }
            minRow++;
 
            for (i = minRow; i < maxRow; ++i) {
                System.out.print(a[i][maxCol - 1] + ", ");
            }
            maxCol--;
 
            if (minRow < maxRow) {
                for (i = maxCol - 1; i >= minCol; --i) {
                    System.out.print(a[maxRow - 1][i] + ", ");
                }
                maxRow--;
            }
 
            if (minCol < maxCol) {
                for (i = maxRow - 1; i >= minRow; --i) {
                    System.out.print(a[i][minCol] + ", ");
                }
                minCol++;
            }
        }
	}

}
