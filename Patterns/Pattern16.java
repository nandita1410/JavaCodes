package Patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= new Scanner(System.in).nextInt();
		int nsp=n/2;
		int nst=1;
		int row=1;
		while(row<=n) {
			for(int csp=1;csp<=nsp;csp++)
				System.out.print(" " );
			for(int cst=1;cst<=nst;cst++) {
				if(cst==1 || cst==nst)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			row++;
			if(row<=n/2) {
				nsp--;
				nst+=2;
			}
			else {
				nsp++;
				nst-=2;
			}
		}

	}

}
