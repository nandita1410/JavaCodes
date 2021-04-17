package Strings;
import java.util.*;
public class SumofNumInStr{
    public  static void findSum(String s) 
    { 
          long ans=0;
         String t="";
        for(int i=0;i<s.length();i++) 
        { 
                    if(s.charAt(i)>='0' && s.charAt(i)<='9') 
                    {
                        t+=s.charAt(i);
                    }
                    else 
                    { 
                        if(t.length()>0)
                            ans+=Long.parseLong(t);  
                            t=""; 
                    } 
            }
            if(t.length()>0)
            ans+=Integer.parseInt(t);  
            System.out.println(ans); 
    } 
       public static void main (String args[]) {
       Scanner scn=new Scanner(System.in);
       int t=scn.nextInt();
       while(t-->0)
       {
           String s=scn.next();
           findSum(s);
       }
    }
}