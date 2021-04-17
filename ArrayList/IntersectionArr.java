
  package ArrayList;
  
  import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
  
  public class IntersectionArr {
  
  public static void main(String[] args) { 
	  // TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] arr = new int[n];
  
  int[] arr2 = new int[n];
  for (int i = 0; i < n; i++)
  { arr[i] = sc.nextInt();
  } 
  for (int i = 0; i < n; i++) { 
	  arr2[i] = sc.nextInt();
	  }
  System.out.println(Intersection(arr, arr2));
  
  } 
  public static ArrayList<Integer> Intersection(int[] arr, int[] arr2){
	  
  ArrayList<Integer> ans= new ArrayList<>();
  Arrays.sort(arr);
  Arrays.sort(arr2);
  int i=0,j=0;
  while(i< arr.length && j< arr2.length)
  { if(arr[i]< arr2[j]) 
	  i++;
  else if(arr[i]> arr2[j])
	  j++;
  else { 
	  ans.add(arr[i]);
	  i++; 
	  j++; 
	  } 
  } 
  return ans; }
  
  }
 

