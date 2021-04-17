package Recursion;

import java.util.*;
public class GenerateSortedArr {
     public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int s= sc.nextInt();
    int q= sc.nextInt();
    int[] a= new int[s];
    int[] b= new int[q];
    for(int i=0;i<s;i++)
      a[i]= sc.nextInt();
      int m=a.length;
    for(int i=0;i<q;i++)
      b[i]= sc.nextInt();
      int n=b.length;
    generate(a, b, m, n);
  }
  static void generateUtil(int A[], int B[], int C[], int i, int j, int m, int n,
            int len, boolean flag) 
    {
        if (flag) // Include valid element from A
        {
            // Print output if there is at least one 'B' in output array 'C'
            if (len != 0) 
                printArr(C, len + 1);
  
            // Recur for all elements of A after current index
            for (int k = i; k < m; k++) 
            {
                if (len == 0) 
                {
                    /* this block works for the very first call to include
                    the first element in the output array */
                    C[len] = A[k];
  
                    // don't increment lem as B is included yet
                    generateUtil(A, B, C, k + 1, j, m, n, len, !flag);
                } 
                  
                /* include valid element from A and recur */
                else if (A[k] > C[len]) 
                {
                        C[len + 1] = A[k];
                        generateUtil(A, B, C, k + 1, j, m, n, len + 1, !flag);
                }
            }
        } 
          
        /* Include valid element from B and recur */
        else
        {
            for (int l = j; l < n; l++) 
            {
                if (B[l] > C[len]) 
                {
                    C[len + 1] = B[l];
                    generateUtil(A, B, C, i, l + 1, m, n, len + 1, !flag);
                }
            }
        }
    }
  
    /* Wrapper function */
    static void generate(int A[], int B[], int m, int n) 
    {
        int C[] = new int[m + n];
       
        /* output array */
        generateUtil(A, B, C, 0, 0, m, n, 0, true);
    }
  
    // A utility function to print an array
    static void printArr(int arr[], int n) 
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
  
}