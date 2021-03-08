package study0307.bookSystem3;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        Scanner sc = new Scanner(System.in);
        System.out.println("查找书籍");
        System.out.println("请输入要查找的书籍的名字：");
        String name = sc.next();
        for (int i = 0; i < bookList.getSize(); i++) {
            if (name.equals(bookList.getBook(i).getName())){
                System.out.println(bookList.getBook(i));
                return;
            }else{
                System.out.println("没有找到你想要的书籍!");
                break;
            }

        }

    }
}
