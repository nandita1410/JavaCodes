package Patterns;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= new Scanner(System.in).nextInt();
		int row=1;
		int nst=n;
		int nsp=-1;
		while(row<=n) {
			for(int cst=1;cst<=nst;cst++)
				System.out.print("*");
			for(int csp=1;csp<=nsp;csp++)
				System.out.print(" ");
			int cst=1;
			if(row==1)
				cst=2;
			for(;cst<=nst;cst++)
				System.out.print("*");
			System.out.println();
			nst--;
			nsp=nsp+2;
			row++;
				
			
		}

	}

}
