package Strings;
import java.util.*;
public class RemoveOccu {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String one = s.next();
        char ch = s.next().charAt(0);
        ArrayList<Character> ch_arr = new ArrayList<Character>();
        for( int i = 0; i < one.length() ;i++)
        {
            char temp = one.charAt(i);
            if(temp != ch)
            {
                ch_arr.add(temp);
            }
        }
        for (char i : ch_arr)
        {
            System.out.print(i);
        }
    }
}