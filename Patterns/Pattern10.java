package Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= new Scanner(System.in).nextInt();
		int row=1;
		while(row<=n) {
			for(int i=1;i<=n;i++) {
				if(row==i || row+i==n+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			row++;
			
		}

	}

}
