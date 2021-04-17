package Patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= new Scanner(System.in).nextInt();
		int row=1;
		int nst=1;
		while(row<=2*n-1) {
			for(int cst=1;cst<=nst;cst++)
				System.out.print("*");
			System.out.println();
			if(row<=n-1)
				nst++;
			else
				nst--;
			row++;
			
		}

	}

}
