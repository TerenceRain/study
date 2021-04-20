package study0420;

import java.util.*;
//倒置字符串
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int i = 0;
        int len = ch.length;
        reverse(ch, 0, len - 1);
        while(i < len){
            int j = i;
            while(j < len && ch[j] != ' '){
                j++;
            }
            if(j < len){
                reverse(ch , i ,j - 1);
                i = j + 1;
            }else{
                reverse(ch, i ,j - 1);
                i = j;
            }
        }

        String str2 = new String(ch);
        System.out.println(str2);
    }

    public static void reverse(char[] ch, int start, int end){
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
}
