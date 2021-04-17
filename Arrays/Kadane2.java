package Arrays;

import java.util.Scanner;

public class Kadane2{

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
		int sum=arr[0];
		int ei=0;
		int max=arr[0];
		int start[]= new int[n];
	 start[0]= 0;
		// int max= arr[0];-- we can write this also above line
		for(int i=0;i<=n-1;i++) {
			int alreadyexisting = sum+ arr[i];
			int freshstart= arr[i];
			if(alreadyexisting > freshstart)
				start[i]= start[i-1];
			else
				start[i]=i;
			
			sum= Math.max(alreadyexisting, freshstart);
			if(sum > max)
				max=sum;
			ei=i;
			
		}
		System.out.println(start[ei]+" "+ei);
		return max;
		
	}

}
