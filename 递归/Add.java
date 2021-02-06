package Study0202;




import java.util.Scanner;

public class Add {
    public static void main(String[] args) {

        System.out.println(add(10));
       
    }

    private static int add(int i ) {
            if( i == 1){
                return  1;
            }
            return i + add( i - 1);
    }

//    private static int add(int n) {
//            while(n > 0){
//               int a = n % 10;
//
//                return  add(n / 10) + a;
//
//            }
//
//        return 0;
//    }
}
