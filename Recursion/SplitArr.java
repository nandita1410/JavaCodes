/*Take as input N, a number. Take N more inputs and store that in an array.

a. Write a recursive function which counts the number of ways the array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Print the value returned.

b. Write a recursive function which keeps track of ways an array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Return type of function should be void. Print the two groups, each time you find a successful split.

Input Format
Take as input N, a number. Take N more inputs and store that in an array.

Constraints
None

Output Format
Display the number of ways the array can be split and display all the groups in a comma separated manner

Sample Input
6
1
2
3
3
4
5
Sample Output
6
1 2 3 3 and 4 5 
1 3 5 and 2 3 4 
1 3 5 and 2 3 4 
2 3 4 and 1 3 5 
2 3 4 and 1 3 5 
4 5 and 1 2 3 3*/


package Recursion;

import java.util.*;
public class SplitArr {
  static int cnt=0;
     static ArrayList<String> ans=null;
  static void solve(int arr[],int n,int i,String s,String t,int sum1,int sum2){
    if(i==n && sum1==sum2 ){
      cnt++;
      ans.add(s+"and "+t);      
      return;
    }
    if(i>n-1)return;          
      solve(arr,n,i+1,s+arr[i]+" ",t,sum1+arr[i],sum2);
      solve(arr,n,i+1,s,t+arr[i]+" ",sum1,sum2+arr[i]);
  }
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
     Arrays.sort(arr);
    int sum=0;
    for(int i=0;i<n;i++)
       sum+=arr[i];         
     ans=new ArrayList<>();
     solve(arr,n,0,"","",0,0);
      System.out.println(cnt);
     for(int i=0;i<ans.size();i++)
      System.out.println(ans.get(i));
    }
}