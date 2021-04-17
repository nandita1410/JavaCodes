package Arrays;

import java.util.Scanner;
public class MaxPathSum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]) {
    int t=sc.nextInt();
    while(t!=0)
    {
       int aar1Length=sc.nextInt();
        int arr2Length=sc.nextInt();
        int[] a=takeInput(aar1Length);
        int[] b=takeInput(arr2Length);
		/*
		 * int m=a.length; int n=b.length;
		 */
        System.out.println(maxPath(a,b,aar1Length, arr2Length));
        t--;
    }
    }
    public static int[] takeInput(int arrLength)
    {
        int[] arr=new int[arrLength];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;  
    }
    
    public static int max(int x, int y) { return (x > y) ? x : y; }
    public static int maxPath(int ar1[],int ar2[],int m,int n)
    {
       int i = 0, j = 0;
        int result = 0, sum1 = 0, sum2 = 0;
        while (i < m && j < n) 
        {
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];
            else
            {
                result += max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                int temp = i;
                while (i < m && ar1[i] == ar2[j])
                    sum1 += ar1[i++];
 
                while (j < n && ar1[temp] == ar2[j])
                    sum2 += ar2[j++];
 
                result += max(sum1, sum2);
 
                sum1 = 0;
                sum2 = 0;
            }
        }
 
        while (i < m)
            sum1 += ar1[i++];
        while (j < n)
            sum2 += ar2[j++];
        result += max(sum1, sum2);
 
        return result;
    }
}