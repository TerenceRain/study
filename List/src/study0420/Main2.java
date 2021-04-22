package study0420;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import study0318.CreatTree;

import java.util.*;
public class Main2{
    public static void main(String[] args){
//        byte b1 = 1, b2 = 2, b3,b6;
//        final byte b4 = 4, b5 = 5;
//
//        b6 = b4 + b5;
        Object o  = new Object(){
            public boolean equals(Object o1){
                return true;
            }


        };
        System.out.println(o.equals("Fred"));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Integer it = new Integer(n);
//        String str = it.toString();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            char ch = str.charAt(i);
//            System.out.print(ch);
//        }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr  = new int[n + 1];
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        int i = 0;
//        int count = 0;
//        while(i < n){
//            if(arr[i] < arr[i + 1]){
//                while(i < n && arr[i] <= arr[i + 1]){
//                    i++;
//                }
//                i++;
//                count++;
//            }else if(arr[i] > arr[i + 1]){
//                while(i < n && arr[i] >= arr[i + 1]){
//                    i++;
//
//                }
//                count++;
//                i++;
//            }else{
//                i++;
//            }
//
//        }
//        System.out.println(count);
        System.out.println(Math.pow(10, 0));
//        int count = 0;
//        int n = 36000;
//        while(n % (int)Math.pow(10,count) == 0){
//            count++;
//        }
//
//        System.out.println(count - 1);
//        long res = test(10);
//        System.out.println(res);
//    }
//
//    public static long test(int n){
//        long product=1;
//        while(n != 1){
//            product = product * n;
//            n--;
//        }
//        return product;
//    }
    }
}