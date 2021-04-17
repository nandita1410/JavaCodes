package Recursion;

import java.util.Scanner;

public class SubSequence {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String que= sc.next();
		String ans= "";
		sub(que,ans);
		System.out.println();
		System.out.println(count);
		
	}
	public static void sub(String que, String ans) {
		if(que.length()==0) {
			System.out.print(ans+" ");
			count=count+1;
			return;
		}
		char ch= que.charAt(0);
		String roq= que.substring(1);
		sub(roq, ans);
		sub(roq, ans+ch);
	}

}
