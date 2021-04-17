package Recursion;

import java.util.Scanner;

public class SunnyBuildings {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int t=sc.nextInt();
    while(t!=0)
    {
       int aar1Length=sc.nextInt();
        int[] a=takeInput(aar1Length);
        System.out.println(countBuildings(a, a.length));
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
		
	
	public static int countBuildings(int arr[], int n)
    {
      
        int count = 1;
        int curr_max = arr[0];
        for (int i = 1; i < n; i++) {
          
            if (arr[i] > curr_max || arr[i] == curr_max) {
                count++;
                curr_max = arr[i];
            }
        }
 
        return count;
    }

}
