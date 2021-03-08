package study0307.bookSystem3;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        Scanner sc = new Scanner(System.in);
        System.out.println("新增书籍");
        System.out.println("请输入新的书籍的名称：");
        String name = sc.next();

        System.out.println("请输入新增书籍的作者：");
        String author = sc.next();

        System.out.println("请输入新增书籍的价格：");
        double price = sc.nextDouble();

        System.out.println("请输入新增书籍的类别：");
        String type = sc.next();

        Book newBook = new Book(name, author, price, type);
        int curSize = bookList.getSize();

        bookList.setBook(curSize, newBook);

        bookList.setSize(curSize + 1);
        System.out.println("新增书籍成功！");
    }
}
