package Strings;

import java.util.*;
public class OddEven {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
		/*
		 * int a=1; char ch= (char)a;
		 */
   
      for(int i=0;i<str.length();i++)
      {
          if(i%2==0)
        	   System.out.print((char) ((int) str.charAt(i) + 1));
          
          else
        	  System.out.print((char) ((int) str.charAt(i) - 1));
          
      }
    }
}