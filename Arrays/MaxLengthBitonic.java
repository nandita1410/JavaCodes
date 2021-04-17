package Arrays;

import java.util.Scanner;

public class MaxLengthBitonic {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		int t=sc.nextInt();
	    while(t!=0)
	    {
	       int n=sc.nextInt();
	        int[] arr=takeInput(n);
	        System.out.println(bitonic(arr,n));
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
	

	public static  int bitonic(int arr[], int n) {
		int[] a = new int[n];
		int[] b= new int[n]; 
		int max; 
	  
  
    a[0] = 1; 
    b[n-1] = 1; 
    for (int i = 1; i < n; i++) 
       a[i] = (arr[i] >= arr[i-1])? a[i-1] + 1: 1; 

   
    for (int i = n-2; i >= 0; i--) 
        b[i] = (arr[i] >= arr[i+1])? b[i+1] + 1: 1; 

    max = a[0] + b[0] - 1; 
    for (int i = 1; i < n; i++) 
        if (a[i] + b[i] - 1 > max) 
            max = a[i] + b[i] - 1; 

    return max; 
} 
	
	
}
