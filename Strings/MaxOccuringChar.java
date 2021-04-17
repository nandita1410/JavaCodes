package Strings;

import java.util.Scanner;

public class MaxOccuringChar {
	public static void main(String[] args) {
		System.out.println("enter string");
		String s=new Scanner(System.in).nextLine();
		System.out.println(maxchar(s));

}
	public static char maxchar(String s) {
		int count[]= new int[1000];
		int len= s.length();
		for(int i=0;i<len;i++)
			count[s.charAt(i)]++;
		int max=-1;
		char result=' ';
		for(int i=0;i<len;i++) {
			if(max< count[s.charAt(i)]) {
				max= count[s.charAt(i)];
				result= s.charAt(i);
			}
		}
		return result;
		
		
	}
}