package Patterns;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String args[]) {
		int n= new Scanner(System.in).nextInt();
		int nst= n/2;
		int nsp= 1;
		int row=1;
		while(row<=n) {
			for(int cst=1;cst<= nst;cst++)
				System.out.print("*");
			for(int csp=1;csp<= nsp; csp++)
				System.out.print(" ");
			for(int cst=1;cst<=nst;cst++)
				System.out.print("*");
			System.out.println();
			if(row<=n/2) {
				nst=nst-1;
				nsp=nsp+2;
			}
			else {
				nsp=nsp-2;
				nst=nst+1;
			}
			row++;
			
		}
		
		
	}
}
