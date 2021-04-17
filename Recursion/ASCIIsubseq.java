package Recursion;

import java.util.*;
public class ASCIIsubseq
{
    static int count=0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        subsequence(s,ans);
        System.out.println();
        System.out.println(count);
    }
    public static void subsequence(String s, String ans) {
        if(s.length()==0) {
            System.out.print(ans+" ");
            count=count+1;
            return ;
        }
        char ch=s.charAt(0);
        String roq=s.substring(1);
        subsequence(roq,ans);
        subsequence(roq,ans+ch);
        subsequence(roq, ans+(int)ch);
    }
}

