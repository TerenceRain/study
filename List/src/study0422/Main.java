package study0422;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String cur = "";
        String ret = "";
        int i = 0;
        for(; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                cur = cur + ch + "";
            }else{
                if(cur.length() > ret.length()){
                    ret = cur;
                }else{
                    cur = "";
                }
            }
        }
        if(i == str.length() && cur.length() > ret.length()){
            ret = cur;
        }
        System.out.println(ret);
    }
}
