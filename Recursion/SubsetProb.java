/*Take as input N, a number. Take N more inputs and store that in an array. Take as input target, a number

a. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.

b. Write a recursive function which prints subsets of the array which sum to target. Return type of functions is void.

Input Format
Take as input N, a number. Take N more inputs and store that in an array.Take as input target, a number

Constraints
None

Output Format
Display the number of subsets and print the subsets in a space separated manner.

Sample Input
3
1
2
3
3
Sample Output
1 2  3
2*/


package Recursion;

import java.util.*;
public class SubsetProb{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0 ; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();
        int res = Subset(arr, 0, target, 0, "");
        System.out.println();
        System.out.println(res);
    }

    public static int Subset(int arr[], int vidx, int target, int sum, String ans)
    {
        if (vidx == arr.length)
        {
            if (sum == target)
            {
                System.out.print(ans + " ");
                // System.out.println();
                return 1;
            }
            return 0;
        }

        int count = 0;
        count += Subset(arr, vidx+1, target, sum + arr[vidx], ans + arr[vidx] + " ");
        count += Subset(arr, vidx+1, target, sum, ans);
        return count;
    }
}