package Strings;
import java.util.*;
public class DiagonalTraversal{
    public static void main (String args[]) {
        int r,c,i,j;
        Scanner sc = new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        int a[][]=new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++)
            a[i][j]=sc.nextInt();
        }
    printMatrixDiagonal(a,r,c);
    sc.close();
    }
       static final int MAX = 100; 
    static void printMatrixDiagonal(int mat[][], int n,int m) 
    { 
        int i = 0, j = 0; 
        boolean isUp = true; 
        for (int k = 0; k < n * m;) { 
            if (isUp) { 
                for (; i >= 0 && j < m; j++, i--) { 
                    System.out.print(mat[i][j] + " "); 
                    k++; 
                } 
                if (i < 0 && j <= m - 1) 
                    i = 0; 
                if (j == m) { 
                    i = i + 2; 
                    j--; 
                } 
            } 
            else { 
                for (; j >= 0 && i < n; i++, j--) { 
                    System.out.print(mat[i][j] + " "); 
                    k++; 
                } 
                if (j < 0 && i <= n - 1) 
                    j = 0; 
                if (i == n) { 
                    j = j + 2; 
                    i--; 
                } 
            } 
            isUp = !isUp; 
        } 
    }
}