package Arrays;

import java.util.Scanner;

public class KadaneAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("enter size");
		int n=new Scanner(System.in).nextInt();
		int[] a=new int[n];
		
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			a[i]=new Scanner(System.in).nextInt();
		}
		int b= kadane(a,n);
		System.out.println(b);
		

	}
	public static int kadane(int[] arr, int n) {
		int sum=0;
		int max=Integer.MIN_VALUE;
		// int max= arr[0];-- we can write this also above line
		for(int i=0;i<=n-1;i++) {
			sum= Math.max(sum+arr[i], arr[i]);
			if(sum > max)
				max=sum;
			
		}
		return max;
		
	}

}
