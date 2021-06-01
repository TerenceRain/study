package study0526;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.next();
            String t = sc.next();
            System.out.println(med(s,t));
        }
    }
    public static int med(String s, String t){
        int count = 0;
        for(int i = 0; i <= s.length() - t.length(); i++){
            if(s.substring(i, i + t.length()).equals(t)){
                count++;
            }
            i += t.length() - 1;
        }
        return count;
    }
}