package Strings;

import java.util.Scanner;

public class CountPalinSubSt {
	public static void main(String[] atg) {
		  String str=  new Scanner(System.in).nextLine();
	       System.out.println( countpalind(str));
		
	}
	public static int countpalind(String str) {
		int count=0;
		for(int si=0; si<str.length();si++) {
			for(int ei=si+1; ei<=str.length();ei++) {
				String ss= str.substring(si,ei);
				if(palind(ss))
					count++;
			}
		}
		return count;
	}
	public static boolean palind(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            return false;
            i++;

            j--;
        }
        return true;
    }

}
