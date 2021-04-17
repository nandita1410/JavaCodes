package Strings;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= new Scanner(System.in).nextLine();
		StringBuilder s= new StringBuilder();
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i-1)== str.charAt(i)) {
				count++;
			}
			else {
				s.append(str.charAt(i-1));
				if(count!=1)
					s.append(count);
				count=1;
			}
		}
		s.append(str.charAt(str.length()-1));
		if(count!=1)
			s.append(count);
		System.out.println(s.toString());
	}

}
