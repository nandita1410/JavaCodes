package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= new Scanner(System.in).nextInt();
		int nst=n;
		int nsp=0;
		int row=1;
		while(row<=n) {
			for(int csp=1;csp<=nsp;csp++)
				System.out.print(" ");
			for(int cst=1;cst<=nst;cst++)
				System.out.print("*");
			System.out.println();
			row++;
			nst--;
			nsp+=2;
		}
		

	}

}
