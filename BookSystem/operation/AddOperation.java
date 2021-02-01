package BookSystem.operation;

import BookSystem.Book;
import BookSystem.BookList;

import java.util.Scanner;

//新增一本书
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("新增书籍");
        System.out.println("请输入新的书籍的名称：");
        String name = scanner.next();
        System.out.println("请输入新的书籍的作者：");
        String author = scanner.next();
        System.out.println("请输入新的书籍的价格：");
        double price = scanner.nextDouble();
        System.out.println("请输入新的书籍的类别：");
        String type  = scanner.next();
        Book newBook = new Book(name,author,price,type);
        int curSize = bookList.getSize();
        bookList.setBook(curSize,newBook);
        bookList.setSize(curSize + 1);
        System.out.println("新增书籍成功");

    }


}
