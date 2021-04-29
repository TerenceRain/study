package study0427;

import java.util.*;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(i == calcu(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static int calcu(int n){
        int sum = 0;
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
//        int i = 5;
//        char c = '2';
//      int r = i * c;
//     double d = r + (double)1;
//        System.out.println(i * c);
//        A a = new A("he");
//        A a1 = new A("he");
//        System.out.println(a == a1);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 0;
//        Integer tn = n;
//        String str = Integer.toBinaryString(tn);
//        System.out.println( str);
//        char[] ch = new char[str.length()];
//        for(int i = 0; i < str.length(); i++){
//            ch[i] = str.charAt(i);
//        }
//        for(int i = 0;  i < ch.length; i++){
//            if(ch[i] == '1'){
//                count += 1;
//            }
//        }
//        System.out.println(count);
    }
