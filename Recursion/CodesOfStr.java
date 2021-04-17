package Recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class CodesOfStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> list = new ArrayList<>();
        printCode(str, "",list);
        System.out.println(list);
    }
    public static void printCode(String ques, String ans, ArrayList<String> list) {
        if (ques.length() == 0) {
            list.add(ans);
            return;
        } else if (ques.length() == 1) {
            char ch = ques.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                ans = ans + code;
                list.add(ans);
            }
        } else {
            char ch = ques.charAt(0);
            String roq = ques.substring(1);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                printCode(roq, ans + code,list);
            }
            String ch12 = ques.substring(0, 2);
            String ros = ques.substring(2);
            int ch12v = Integer.parseInt(ch12);
            if (ch12v <= 26) {
                char code = (char) ('a' + ch12v - 1);
                printCode(ros, ans + code,list);
            }
        }
    }
}