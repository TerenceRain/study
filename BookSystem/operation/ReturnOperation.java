package BookSystem.operation;

import BookSystem.Book;
import BookSystem.BookList;
import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public  void  work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("归还书籍");
        System.out.println("请输入要归还的书籍的名称：");
        String name = scanner.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if (bookList.getBook(i).getName().equals(name)) {
                break;
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("找不到该书籍，无法归还！");
        } else {
            Book currentBook = bookList.getBook(i);
            if (!currentBook.isBorrowed()){
                System.out.println("该书没有被借出，无法归还！");
            }else{
                currentBook.setBorrowed(false);
                System.out.println("归还成功！");
            }
        }
    }
}
