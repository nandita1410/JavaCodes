package Recursion;

import java.util.*;
public class GenerateBinary {
    public static void wildcard(String ques,String ans){
        if(ques.length() == 0){
            System.out.print(ans+" ");
            return;
            }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        if(ch=='0'|| ch=='1'){
            wildcard(roq,ans+ch);
        }
        else{
        wildcard(roq,ans+'0');
        wildcard(roq,ans+'1');
        }
    }
    public static void main(String args[]) {
        Scanner sn= new Scanner(System.in);
        int t = sn.nextInt();
        while(t-->0){
        String s= sn.next();
        wildcard(s,"");
            System.out.println();
        }
    }
}