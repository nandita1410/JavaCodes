package Recursion;
import java.util.Scanner;
import java.util.*;
public class KeyPad {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        keypadCodes(s,"");

        System.out.println();

        System.out.println(keypadCodesCount(s,""));
    }

     
		static String keypadCode[] = { "","abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wx" , "yz" };

		 
		 public static void keypadCodes(String num, String ans){
			 

			 if(num.length() == 0){
					
					System.out.print(ans + " ");
					return;
				}
				char c = num.charAt(0);
				String ros = num.substring(1);
				String code = keypadCode[c-'0'];
				
				for(int i = 0 ; i < code.length() ; i++ ){
					
					keypadCodes(ros,ans+code.charAt(i));
					
					
				}
				 
			
				 
			 }
		 
		 static int a = 0;
		 
		 public static int keypadCodesCount(String num, String ans){
			 

			 
			 if(num.length() == 0){
					
					return a++;
					
				}
				char c = num.charAt(0);
				String ros = num.substring(1);
				String code = keypadCode[c-'0'];
				
				for(int i = 0 ; i < code.length() ; i++ ){
					
					keypadCodesCount(ros,ans+code.charAt(i));
					
					
				}
				return a; 
				 
			 }
}