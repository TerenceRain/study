package study0307.bookSystem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object o = null;
        BookList bookList = new BookList();
        User user = login();
        while(true){
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }

    private static User login() {
        System.out.println("请输入您的姓名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("请选择您的身份：1 管理员 2 普通用户");
        int who = sc.nextInt();
        if (who == 1){
            return new Admin(name);
        }
        return new NormalUser(name);
    }
}
