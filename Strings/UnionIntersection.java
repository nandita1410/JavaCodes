package Strings;
import java.util.*;
public class UnionIntersection{
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<arr1.length; i++)
            arr1[i] = scn.nextInt();
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<arr2.length; i++)
            arr2[i] = scn.nextInt();
        union_intersection(arr1, arr2);
    }
    public static void union_intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<Integer>();
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]>arr2[j])
            {
                if(!union.contains(arr2[j]))
                    union.add(arr2[j]);
                j++;
            }
            else if(arr1[i]<arr2[j])
            {
                if(!union.contains(arr1[i]))
                    union.add(arr1[i]);
                i++;
            }
            else
            {if(!union.contains(arr1[i]))
            union.add(arr1[i]);
            if(!intersection.contains(arr1[i]))
             intersection.add(arr1[i]);
            i++;
                j++;
            }
        }
        while(i<arr1.length) {
            if(!union.contains(arr1[i]))
            union.add(arr1[i]);
           i++;
        }
        while(j<arr2.length) {
            if(!union.contains(arr2[j]))
            union.add(arr2[j]);
            j++;}
        for(int k = 0; k < union.size(); k++)
            System.out.print(union.get(k)+" ");
        System.out.println();
        for(int k = 0; k < intersection.size(); k++)
            System.out.print(intersection.get(k)+" ");
    }
}