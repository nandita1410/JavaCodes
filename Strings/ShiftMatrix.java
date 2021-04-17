package Strings;

import java.util.Scanner;

public class ShiftMatrix {

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
        int k= sc.nextInt();
        shifting(arr,n,k);

	}
	
	public static void shifting(int arr[][], int n,int k) {
		
           
        int j = 0; 
        while (j < n) { 
               
            // Print elements from index k 
            for (int i = k; i < n; i++) 
                System.out.print(arr[j][i] + " "); 
                   
            // Print elements before index k 
            for (int i = 0; i < k; i++) 
                System.out.print(arr[j][i] + " "); 
                   
            System.out.println(); 
            j++; 
        } 
	}

}
