package Arrays;
import java.util.*;
public class NextPermutation{
	static Scanner sc=new Scanner(System.in);
    public static void main(String args[]) {
    int t=sc.nextInt();
    while(t!=0)
    {
       int aar1Length=sc.nextInt();
        int[] a=takeInput(aar1Length);
       int[] c= nextper(a);
       display(c);
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
    public static void display(int[] a) {
    	for(int i=0;i<a.length;i++) {
    		
    		System.out.print(a[i]+" ");
    	}
    	System.out.println();
    }
	public static int[] nextper(int[] A) {

        int i;
        for(i = A.length - 1; i > 0; i--) {
            if(A[i] > A[i-1]) {
                break;
            }
        }
        
        if(i == 0) {
            Arrays.sort(A);
            return A;
        }
        
        int idx = i;
        for(int j = i; j < A.length; j++) {
            if(A[j] > A[i-1]) {
                idx = j;
            }
        }
        
        int tmp = A[i - 1];
        A[i - 1] = A[idx];
        A[idx] = tmp;
        Arrays.sort(A, i, A.length);
        
        return A;
    }
	
}