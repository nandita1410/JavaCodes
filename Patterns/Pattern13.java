package Patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= new Scanner(System.in).nextInt();
		int row=1;
		int nsp=0;
		int nst=n;
		while(row<=2*n-1) {
			for(int csp=1;csp<=nsp;csp++)
				System.out.print(" ");
			for(int cst=1;cst<=nst;cst++)
				System.out.print("*");
			System.out.println();
			if(row<=n-1) {
				nst--;
				nsp+=2;
				
			}
			else {
				nst++;
				nsp-=2;
			}
			row++;
		}
		

	}

}
