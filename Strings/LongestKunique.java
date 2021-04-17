package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class LongestKunique {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		int t=sc.nextInt();
	    while(t!=0)
	    {
	    	String arr= sc.next();
	       int k=sc.nextInt();
	        
	       kUniques(arr,k);
	        t--;
	    }
	
	}
	/*
	 * public static String takeInput() { String str=sc.nextLine(); return str;
	 * 
	 * }
	 */
    
    final static int MAX_CHARS = 26; 
   
   public  static boolean isValid(int count[], 
                                    int k) 
     { 
         int val = 0; 
         for (int i = 0; i < MAX_CHARS; i++) 
         { 
             if (count[i] > 0) 
             { 
                 val++; 
             } 
         } 

         return (k >= val); 
     } 
  
      public  static void kUniques(String s, int k) 
     { 
         int u = 0; 
         int n = s.length(); 
  
         int count[] = new int[MAX_CHARS]; 
         Arrays.fill(count, 0); 
         
         for (int i = 0; i < n; i++) 
         { 
             if (count[s.charAt(i) - 'a'] == 0) 
             { 
                 u++; 
             } 
             count[s.charAt(i) - 'a']++; 
         } 
   
         if (u < k) { 
             System.out.print("-1"); 
             return; 
         } 
  
         int curr_start = 0, curr_end = 0; 
         int max_window_size = 1;

         Arrays.fill(count, 0); 
         count[s.charAt(0) - 'a']++; 
  
         for (int i = 1; i < n; i++) { 
    
             count[s.charAt(i) - 'a']++; 
             curr_end++; 
             while (!isValid(count, k)) { 
                 count[s.charAt(curr_start) - 'a']--; 
                 curr_start++; 
             } 
             if (curr_end - curr_start + 1 > max_window_size) 
             { 
                 max_window_size = curr_end - curr_start + 1; 
             } 
         } 
  
         System.out.println(max_window_size); 
     } 

}
