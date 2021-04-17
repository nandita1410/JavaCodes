package Arrays;

import java.util.*;
public class WaveRowDisplay{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int arr[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        wave(arr);
        System.out.print("END");


    }
    public static void wave(int[][] arr){
        for(int r=0;r<arr.length; r++){
            if(r%2==0){
                for(int c=0;c<arr[0].length;c++){
                    System.out.print(arr[r][c]+", ");
                }
            }
            else{
                for(int c= arr[0].length-1; c>=0; c--){
                     System.out.print(arr[r][c]+", ");
                }
            }
           
        }
        
    }
}