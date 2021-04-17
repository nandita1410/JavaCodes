package Patterns;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		int n= new Scanner(System.in).nextInt();
		int nst=1;
		int row=1;
		while(row<=n) {
			for(int col=1;col<=nst;col++)
				System.out.print("*");
		System.out.println();
		row++;
		nst++;
		}
	}
	

}
