
/*The first line contains an integer ‘n’ denoting the number of items in the shop. The second line contains ‘n’ space-separated integers describing the respective price of each item. The third line contains an integer ‘q’ denoting the number of queries. Each of the subsequent lines contains two space-separated integers ‘A’ and ‘k’
For each query, print Yes on a new line if the shopkeeper is correct; otherwise, print No instead.

Sample Input
4
100 200 400 100
5
100 2
200 3
500 4
600 4
800 4
Sample Output
Yes
Yes
No
No
Yes
Explanation
In query 1, Alex hai 100 units of money. The shopkeeper claims that she can choose to buy from 2 kinds of items ie item 1 and item 4 each priced at 100.

In query 2, The shopkeeper claims that she can choose to buy from 3 kinds of items ie item 1 and item 4 each priced at 100(she can buy 1 from either of the two) or item 2 priced at 200(she can buy one)

In query 3, she has 500 units of money. She can either buy item 1 or item 4 ( 5 of each kind respectively). Thus, she has only 2 kinds of items to choose from.

In query 5, she has 800 units of money. She can either buy item 1 or item 4 ( 8 of each kind respectively) or item 2(she can buy 4 of these) or item 3(2 of these). Thus, she has 4 kinds of items to choose from.*/
package Arrays;

import java.util.Scanner;
public class AlexaGoShopping {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        while (q != 0) {
            int A = sc.nextInt();
            int K = sc.nextInt();
            query(a, A, K);
            q--;

        }
    }

    public static void query(int[] a, int A, int K) {
        int count = 0;
        for (int var : a) {
            if (A % var == 0) {

                count++;
            }
        }
        if (count >= K) {
            System.out.println("Yes");
        } else {

            System.out.println("No");
        }
    }
}