package Patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= new Scanner(System.in).nextInt();
		int nsp= 2*n-3;
		int nst= 1;
		int row=1;
		while(row<=n) {
			for(int cst=1;cst<=nst;cst++)
				System.out.print("*\t");
			for(int csp=1;csp<=nsp;csp++)
				System.out.print("\t");
			int cst=1;
			if(row==n)
				cst=2;
			for(;cst<=nst;cst++)
				System.out.print("*\t");
			System.out.println();
			nst++;
			nsp-=2;
			row++;
			
			
		}

	}

}
