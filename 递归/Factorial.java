package Study0202;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("请输入要计算的阶乘的项数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {

        if (n == 1) {
            return 1;

        }
        return n * factorial( n -1 );
    }
}
