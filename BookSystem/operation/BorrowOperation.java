package BookSystem.operation;

import BookSystem.Book;
import BookSystem.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("借阅书籍");
        System.out.println("请输入要借阅书籍的名字：");
        String name = scanner.next();

        int i = 0;
        for(; i < bookList.getSize() ; i++){
            if(name.equals(bookList.getBook(i).getName())){
                break;
            }
        }
        if(i >= bookList.getSize()){
            System.out.println("没有找到你想要的书籍，无法完成借阅要求");
        }else{
            Book currentBook = bookList.getBook(i);
            if(currentBook.isBorrowed()){
                System.out.println("该书籍已经被借出！");
            }else{
                bookList.getBook(i).setBorrowed(true);
                System.out.println("借书成功！");
            }
        }

    }
}
