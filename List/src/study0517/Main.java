package study0517;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long n = sc.nextLong();
            int ans = calcu(n);
            System.out.println(ans);
        }
    }
    public static int calcu(long num){
        long ans = 0;
        if(num < 10){
            ans = num;
            return (int)ans;
        }
        String s = String.valueOf(num);
        long temp = 0;
        for(int i = 0; i < s.length(); i++){
            temp += Long.parseLong(s.substring(i, i+1));
        }
        return calcu(temp);
    }
}