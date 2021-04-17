package Strings;

import java.util.Scanner;

public class RotateImage90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        rotate(n, arr); 
    
        display(n, arr); 

	}
	public static void rotate(int n, int arr[][]) 
	    { 
	      
	        for (int i = 0; i < n / 2; i++) { 
	         
	            for (int y=i; y < n - i - 1; y++) { 
	              
	                int temp = arr[i][y]; 
	                arr[i][y] = arr[y][n - 1 - i]; 
	 
	                arr[y][n - 1 - i] = arr[n - 1 - i][n - 1 - y];
	                    
	                arr[n - 1 - i][n - 1 - y] = arr[n - 1 - y][i]; 

	                arr[n - 1 - y][i] = temp; 
	            } 
	        } 
	    }
	   public static void display(int n, int arr[][]) 
	    { 
	        for (int i = 0; i < n; i++) { 
	            for (int j = 0; j < n; j++) 
	                System.out.print( arr[i][j]+" "); 
	  
	            System.out.print("\n"); 
	        } 
	      //  System.out.print("\n"); 
	    } 

	  

}
