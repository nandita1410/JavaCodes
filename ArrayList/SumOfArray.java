package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter size:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		System.out.println("enter elements:");
		int[] arr= new int[n];
		int[] arr2= new int[m];
		
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(int i=0;i<m;i++)
			arr2[i]=sc.nextInt();
		
		ArrayList<Integer> ans= sumArray(arr, arr2);
		System.out.print(ans);
		
	}
	public static ArrayList<Integer> sumArray(int[] arr, int[] arr2)
	{
		ArrayList<Integer> res= new ArrayList<>();
		int i= arr.length-1;
		int j= arr2.length-1;
		int carry=0;
		while(i>=0 || j>=0) {
			int sum= carry;
			if(i>=0)
				sum+=arr[i];
			if(j>=0)
				sum+=arr2[j];
			int rem= sum%10;
			res.add(0,rem);
			carry= sum/10;
			
			i--;
			j--;
		}
		if(carry>0)
			res.add(0,carry);
		return res;
		

}

}
