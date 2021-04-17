package Patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		int n= new 	Scanner(System.in).nextInt();
	
		int row=1;
		while(row<=n) {
			for(int i=1;i<=n;i++ ) {
				if(i==n || i==1 || row==1 || row==n )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			row++;
		}

	}

	
}