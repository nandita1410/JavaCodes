package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp;
    Scanner sc = new Scanner (System.in);
    int n= sc.nextInt();
    String str [] = new String[n];
    for(int i=0;i<n;i++)
    {
    	str[i]= sc.next();
    }
    
    for(int i=0;i<n;i++)
    {
    	for(int j=i+1;j<n;j++)
    	{
            int l1 = str[i].length();
            int l2 = str[j].length();
            if(l1 != l2)
            {
                int len = Math.min(l1, l2);
                String s1 = str[i].substring(0, len);
                String s2 = str[j].substring(0, len);
                if(s1.compareTo(s2) == 0)
                {
                    if(l1 < l2)
                    {
                        temp=str[i];
                        str[i]=str[j];
                        str[j]=temp;
                    }
                    continue;
                }
            }
            if(str[i].compareTo(str[j]) > 0)
            {
                temp=str[i];
    			str[i]=str[j];
    			str[j]=temp;
            }
    	}
    }
    for(int i=0;i<n;i++)
    {
    	System.out.println(str[i]);
    }
    
	}

}
