package Arrays;

import java.util.Scanner;

public class RotationArr {
	public static void main(String[] args) {
		System.out.println("enter size");
		int n=new Scanner(System.in).nextInt();
		int[] a=new int[n];
		
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			a[i]=new Scanner(System.in).nextInt();
		}
		System.out.println("enter rotation");
		int rot= new Scanner(System.in).nextInt();
		rotate(a,n, rot);
	}
	public static void rotate(int a[], int n, int rot) {
		rot=rot % n;
		for(int r=1;r<=rot;r++)
		{
			int temp= a[n-1];
			for(int j= n-1; j>=1;j--)
				a[j]=a[j-1];
			a[0]=temp;
			
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		
		
		
	}

}
