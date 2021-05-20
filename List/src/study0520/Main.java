package study0520;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int ans = med(n);

            System.out.println(ans);
        }
    }
    public static int med(int n){
        int first = 1;
        int second = 1;
        int num = 0;
        for(int i = 3; i <= n; i++){
            num = first + second;
            first = second;
            second = num;
        }
        return num;
    }
}