package Strings;import java.util.*;
public class Nobita {
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int x=sc.nextInt();
            int n=sc.nextInt();
            int res=nobita(x,n);
            System.out.println(res);
            t--;
        }
    }
    public static int nobita(int x, int n){
        if(x%n==0)
            return 0;
        else if(x<n)
            return n-x;
        else
            return x%n;
    }
}