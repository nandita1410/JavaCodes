/*Given a positive integer, find maximum integer possible by doing at-most K swap operations on its digits.

Input Format
Two positive integers N and K where N denotes the number on which swaps are supposed to be performed and K denotes the maximum swaps available.

Constraints
0 <= N <= 10^12 0 <= K <= 10

Output Format
Single Maximum integer possible by doing at-most K swap operations on digits of N

Sample Input
254 1
Sample Output
524*/


package Recursion;

import java.util.Scanner;

public class MaxNumByKSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		int k= sc.nextInt();
		max = str;
		  findMax(str.toCharArray(), k);
		  System.out.print(max + "\n");

	}
	static String max;
	public static void findMax(char[] str,int k)
	{
	  if (k == 0)
	    return;
	 
	  int n = str.length;
	 
	  for (int i = 0; i < n - 1; i++)
	  {
	    for (int j = i + 1; j < n; j++)
	    {
	      if (str[i] < str[j])
	      {
	       
	        char t = str[i];
	        str[i] = str[j];
	        str[j] = t;
	 
	        if (String.valueOf(str).compareTo(max) > 0)
	          max = String.valueOf(str);
	        findMax(str, k - 1);
	 //backtrack
	        char c = str[i];
	        str[i] = str[j];
	        str[j] = c;
	      }
	    }
	  }
	}
	 

}
