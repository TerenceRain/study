package Study0222;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("请输入第一个数：");
            int num1 = sc.nextInt();
            System.out.println("请输入第二个数：");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println(result);
        }catch (Exception e){
            System.out.println("出现异常的信息是：");
            e.printStackTrace();
        }
    }
}
