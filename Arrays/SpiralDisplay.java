package Arrays;

import java.util.Scanner;

public class SpiralDisplay {
	public static void main(String[] args) {
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
	public static void spiral(int[][]arr) {
		int noe= arr.length * arr[0].length;
		int minRow=0;
		int maxRow= arr.length-1;
		int minCol=0;
		int maxCol= arr[0].length-1;
	
		while(minRow < maxRow && minCol < maxCol) {
			for(int r=minCol; r<= maxCol ; ++r) {
				System.out.print(arr[minRow][r]+", ");
			
			}
			minRow++;
			for(int i=minRow;i<=maxRow;++i) {
				System.out.print(arr[i][maxCol-1]+", ");
			
			}
			maxCol--;
			
				for (int i = maxCol - 1; i >= minCol; --i) {
                    System.out.print(arr[maxRow - 1][i] + ", ");
                }
                maxRow--;
                for (int i = maxRow- 1; i >= minRow; --i) {
	                    System.out.print(arr[i][minCol] + " ");
	                }
	                minCol++;
	            
			
		}
		
		
	}

}
