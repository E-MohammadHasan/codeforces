package codeforces;

import java.util.Scanner;

public class Way_To_Long_Words {

    // ---------The Question ---------> 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        sc.nextLine();  // Consume the newline character after nextInt()

        for (int i = 0; i < z; i++) {
            String s = sc.nextLine();
            int n = s.length();
            if (n < 11) {
                System.out.println(s);
            } else {
                char ch = s.charAt(0);
                char ch1 = s.charAt(n - 1);
                System.out.print(ch);
                System.out.print(n - 2);
                System.out.println(ch1);
            }
        }
    }
}
