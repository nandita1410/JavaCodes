package Patterns;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		int n= new Scanner(System.in).nextInt();
		int nsp=n-1;
		int nst=1;
		int row=1;
		while(row<=n) {
			for(int csp=1;csp<=nsp;csp++)
				System.out.print(" ");
			for(int cst=1;cst<=nst;cst++)
				System.out.print("*");
			System.out.println();
			row++;
			nsp--;
			nst=nst+2;
		}
		
	}
}
