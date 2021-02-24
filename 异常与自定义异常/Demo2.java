package Study0222;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("请输入第一个数：");
            int num1 = sc.nextInt();
            System.out.println("请输入第二个数：");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println(result);
        } catch(ArithmeticException ex1){
            System.out.println("数学运算异常！");
            ex1.printStackTrace();
        }catch(InputMismatchException ex2){
            System.out.println("输入异常！");
            ex2.printStackTrace();
        }catch (Exception e){
            System.out.println("出现异常的信息是：");
            e.printStackTrace();
        }
    }
}

