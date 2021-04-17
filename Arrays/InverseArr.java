package Arrays;

import java.util.Scanner;

public class InverseArr {
	public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt();
		int[] a=new int[n];
		
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			a[i]=new Scanner(System.in).nextInt();
		}
		int res[]= inverse(a, n);
		display(res);
    }
    public static void display(int[] arr) {

    for (int val : arr)
      System.out.print(val + " ");

    System.out.println();
  }
	public static int[] inverse(int[] a, int n) {
		int[] res= new int[n];
		for(int i=0;i<n;i++) {
			res[a[i]]=i;
		}
		return res;
	}

}
