package Arrays;
import java.util.*;
public class FormMinNum {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String[] str= new String[n];
        for(int i=0;i<n;i++)
         str[i] = sc.next();
       for(String input: str)
    	   printNumber(input);

    }
    public static void printNumber(String arr){
    	int min_avail = 1, pos_of_I = 0;  
    	  
        //vector to store the output 
        ArrayList<Integer> al = new ArrayList<>(); 
          
        // cover the base cases 
        if (arr.charAt(0) == 'I')  
        {  
            al.add(1);  
            al.add(2);  
            min_avail = 3;  
            pos_of_I = 1;  
        }  

        else
        { 
            al.add(2); 
            al.add(1); 
            min_avail = 3;  
            pos_of_I = 0;  
        } 

        // Traverse rest of the input 
        for (int i = 1; i < arr.length(); i++) 
        { 
             if (arr.charAt(i) == 'I') 
             { 
                 al.add(min_avail); 
                 min_avail++; 
                 pos_of_I = i + 1; 
             } 
             else
             { 
                 al.add(al.get(i)); 
                 for (int j = pos_of_I; j <= i; j++) 
                      al.set(j, al.get(j) + 1); 

                 min_avail++; 
             } 
        } 

        // print the number 
        for (int i = 0; i < al.size(); i++) 
             System.out.print(al.get(i)); 
        System.out.println(); 

    }
}