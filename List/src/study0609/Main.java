package study0609;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        String[] sum = new String[m];
        for (int i = 0; i < t; i++) {
            String name = sc.next();
            int n = sc.nextInt();
            String[] word = new String[n];
//            System.out.println(n);
//            String ignore = sc.nextLine();
            for (int j = 0; j < n; i++) {
                word[j] = sc.nextLine();
            }
            System.out.println(Arrays.toString(word));
        }
    }
    }
