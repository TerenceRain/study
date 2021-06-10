package study0609;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            String out = med(str1, str2);
            System.out.println(out);
        }
    }
    public static String med(String str1, String str2){
        StringBuilder sb = new StringBuilder(str1);

        for(int i = 0; i < str2.length(); i++){
            char ch = str2.charAt(i);
            if(sb.toString().contains("" + ch)){
                sb.deleteCharAt(sb.indexOf( "" + ch));

            }else{
                return "No";
            }
        }
        return "Yes";
    }
}