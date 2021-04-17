package Arrays;

import java.util.*;
public class TrappingWater {
     static Scanner sc=new Scanner(System.in);
    public static void main(String args[]) {
    int t=sc.nextInt();
    while(t!=0)
    {
       int aar1Length=sc.nextInt();
        int[] a=takeInput(aar1Length);
        System.out.println(findWater(a,aar1Length));
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
    
    public static int findWater(int arr[], int n){
        int left[] = new int[n];
        int right[] = new int[n];
        int water = 0;
 
        // Fill left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);
 
        // Fill right array
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);
        
        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - arr[i];
 
        return water;
 
    }


    }
