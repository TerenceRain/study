package study0415;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //比赛队伍哪个水平高
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] array = new int[3 * n];
            long sum = 0;
            for (int i = 0; i < array.length; i++){
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            for (int i = 0; i < n; i++) {
                sum += array[array.length - 2 * (i + 1)];
            }
            System.out.println(sum);
        }
    }
}
