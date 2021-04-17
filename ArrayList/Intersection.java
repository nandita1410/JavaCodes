package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Intersection {
	public static void main(String [] args) {
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
		
		ArrayList<Integer> ans= intersectionele(arr, arr2, n, m);
		for(Integer x: ans)
			System.out.println(x+" ");
	}
	
	public static ArrayList<Integer> intersectionele(int[] arr, int[] arr2, int n, int m)
	{
		ArrayList<Integer> list= new ArrayList<>();
		int i=0, j=0;
		while(i<n && j<m) {
			if(arr[i] == arr2[j]) {
				list.add(arr[i]);
				i++;
				j++;
				
			}
			else if(arr[i] > arr2[j]) {
				j++;
			}
			else {
				i++;
			
			}
		}
		return list;
	}

}
