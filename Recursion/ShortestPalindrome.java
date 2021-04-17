/*Given a string s, you are allowed to convert it to a palindrome by adding characters in front of it. Find and return the shortest palindrome you can find by performing this transformation.

Input Format
Take input String s

Constraints
length of String <10000

Output Format
print the shortest palindrome string

Sample Input
aacecaaa
Sample Output
aaacecaaa*/

package Recursion;

import java.util.*;
public class ShortestPalindrome{
    public static String SP()
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
    
        String rev=new StringBuilder(str).reverse().toString();
        
        
        for(int i=0;i<str.length();i++)
        {
            if(str.substring(0,str.length()-i).equals(rev.substring(i)))
            {
                return rev.substring(0, i)+str;
                
            }
            
        }
        return "";
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.out.println(SP());
        
        
    }
}