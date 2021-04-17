package Strings;
import java.util.*;
public class isPalin{
    public static void main(String args[]) {
        // Your Code Here
        String str=  new Scanner(System.in).nextLine();
       System.out.println( palind(str));

    }
    public static boolean palind(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            return false;
            i++;

            j--;
        }
        return true;
    }
}
