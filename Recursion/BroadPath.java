
/*Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders). Take as input M, a number. M is the number of faces of the dice.

a. Write a recursive function which returns the count of different ways the board can be traveled using the dice. Print the value returned.

b. Write a recursive function which prints dice-values for all valid paths across the board (void is the return type for function).

Input Format
Enter a number N (size of the board) and number M(number of the faces of a dice)

Constraints
None

Output Format
Display the number of paths and print all the paths in a space separated manner*/
package Recursion;
import java.util.*;
public class BroadPath {
    static int c=0;
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();//bord size
        int face=sc.nextInt();//no of faces like 1,2,3,4,5
        PrintPaths(0,size,face,"");
        System.out.print("\n");
        count(0,size,face,c);
        System.out.print(c);
    }
    public static void PrintPaths(int src,int size,int face,String res){
        if(src==size){
            System.out.print(res+" ");
            return;
        }
        if(src>size){
            return;
        }
        for(int i=1;i<=face;i++){
            PrintPaths(src+i,size,face,res+i);
        }
    }
    public static void count(int src,int size,int face,int counter){
        if(src==size){
            c++;
            return ;
        }
        if(src>size){
            return ;
        }
        for(int i=1;i<=face;i++)
            count(src+i,size,face,c);
    }
}