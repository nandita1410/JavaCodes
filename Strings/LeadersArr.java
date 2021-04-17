

	
	  package Strings; 
	
	  import java.util.*;
	  public class LeadersArr {
	      static Scanner sc=new Scanner(System.in);
	        public static void main (String args[]) {
	            // take input
	          List<Integer> li=new ArrayList<Integer>();
	       int[] a=takeInput();
	       
	       int n=a.length;
	       // main logic
	       Leaders(a,n,li);
	       // sorting
	       Collections.sort(li);
	       // display
	       for(int i:li)
	        System.out.print(i+" ");
	      }
	      public static int[] takeInput()
	      {
	      int n=sc.nextInt();
	      int[] arr=new int[n];
	      for(int i=0;i<arr.length;i++)
	      {
	          arr[i]=sc.nextInt();
	      }
	      return arr;
	      }

	      public static void Leaders(int[] arr,int size,List<Integer> li)
	      {
	          for (int i = 0; i < size; i++)  
	          { 
	              int j; 
	              for (j = i + 1; j < size; j++)  
	              { 
	                  if (arr[j]>arr[i]) 
	                      break; 
	              } 
	              if (j == size) 
	                li.add(arr[i]); 
	          } 
	      }
	  }