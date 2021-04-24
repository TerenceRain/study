package study0423;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
//        byte n = 31;
//        int n1 = (int)n;
//        String str = Integer.toBinaryString(n);
//        System.out.println(str);
//        int count = 1;
//        char[] ch = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
////            ch[i] = str.charAt(i);
//        }
//        int i = 0;
//
//        while (i < ch.length - 1){
//            if (ch[i] == '1' && ch[i + 1] == '1' ) {
//            count++;
//            }
//            i++;
//        }
////        System.out.println(count);
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.out.println(str1 == str2);
    }
}
