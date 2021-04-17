package Recursion;


import java.util.*;
public class TowerOfHanoi {
    static int steps;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(TOI(n, "src", "dest", "help", 0));
        TOI(n, "T1", "T2", "T3");
        System.out.println(steps);
    }
    public static void TOI(int n, String s, String d, String h)
    {
        if (n==0)
            return;
        TOI(n-1, s, h, d);
        System.out.println("Move " + n +"th disc from "+ s + " to " + d);
        steps+=1;
        TOI(n-1, h, d, s);
        // System.out.println(count);
        // return count;
    }
}