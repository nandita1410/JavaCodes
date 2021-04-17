package Strings;
import java.util.*;
public class Jumbles{
    public static char[] removel(char[] arr,int index)
    {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        char[] anotherArray = new char[arr.length - 1];
        System.arraycopy(arr, 0, anotherArray, 0, index);
        System.arraycopy(arr, index + 1,anotherArray, index,arr.length - index - 1);
        return anotherArray;
    }
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        String s1 =  sn.next();
        String s2 =  sn.next();
        char[] ch1= new char[s1.length()];
        char[] ch2= new char[s2.length()];
        for(int i=0;i<s1.length();i++){
            ch1[i]=s1.charAt(i);
            ch2[i]=s2.charAt(i);
        }
        if(s1.length()==s2.length()){
            for(int i=0;i<s2.length();i++){
                for(int j=0;j<ch1.length;j++){
                    if(s2.charAt(i)==ch1[j]){
                        ch1=removel(ch1,j);
                        ch2=removel(ch2,0);
                        break;
                    }
                }
            }
        }
        else{
           // System.out.print("False");
        }
        if(ch1.length==0 && ch2.length==0){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
