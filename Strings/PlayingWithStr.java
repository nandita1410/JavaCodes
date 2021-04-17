package Strings;

import java.util.*;
public class PlayingWithStr {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int r=goodStrings(s);
        System.out.println(r);
    }
    public static int  goodStrings(String src){
        int i=0,count=0,present=0;
        while(i<src.length()){
            if(src.charAt(i)=='a' || src.charAt(i)=='e' || src.charAt(i)=='i' || src.charAt(i)=='o' || src.charAt(i)=='u' ){
                    count++;
                    if(count>present){
                       present=count;
                    }
            }
            else{
                count=0;
            }
            i++;
        }
        return present;
    }
}