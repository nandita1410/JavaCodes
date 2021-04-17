package Strings;

import java.util.*;
public class Reversewords {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            String str = sc.next();
            reverseWords(str);
        }
    }

    public static void reverseWords(String str) {

        String rev = "";

        int i = str.length() - 1;

        while (i >= 0) {

            while (i >= 0 && str.charAt(i) == ' ') i--;

            int j = i;
            if (i < 0) break;

            while (i >= 0 && str.charAt(i) != ' ') i--;

            if (rev.isEmpty())
                rev = rev.concat(str.substring(i + 1, j + 1));
            else
                rev = rev.concat(" " + str.substring(i + 1, j + 1));
        }

        System.out.println(rev);

    }
}
