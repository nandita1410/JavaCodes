package Patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Scanner(System.in).nextInt();
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		while (row <= 2 * n - 1) {
			for (int csp = 1; csp <= nsp; csp++)
				System.out.print(" ");
			for (int cst = 1; cst <= nst; cst++)
				System.out.print("*");
			System.out.println();
			if (row <= n - 1) {
				nst++;
				nsp--;
			} else {
				nst--;
				nsp++;
			}
			row++;

		}

	}

}
