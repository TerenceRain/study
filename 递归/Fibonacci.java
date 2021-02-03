package Study0202;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要求的项数：");
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2 );
    }
}
