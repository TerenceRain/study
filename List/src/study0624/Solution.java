package study0624;

import java.util.Arrays;

class Solution {
    public static String reverseWords(String s) {
        s = s.trim();
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
        String[] str =s.split(" ");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i] + "/");
        }

        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < str.length - 1; i++){
            StringBuilder sb1 = new StringBuilder(str[i]);
            sb1.reverse();
            sb2.append(sb1.toString());
            sb2.append(" ");
        }
        sb2.append(new StringBuilder(str[str.length - 1]).reverse());
        return sb2.toString();

    }

    public static void main(String[] args) {
        reverseWords("   he  ll o   !");
    }

}