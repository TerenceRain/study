package study0307.bookSystem3;

import java.util.Scanner;

public class BorrowedOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        Scanner sc = new Scanner(System.in);
        System.out.println("借阅书籍");
        System.out.println("请输入要借阅书籍的名字：");

        String name = sc.next();

        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if (name.equals(bookList.getBook(i).getName())){
                break;
            }
        }
        if (i >= bookList.getSize()){
            System.out.println("没有找到您要借阅的书籍！");

        }else{
            Book cur = bookList.getBook(i);
            if (cur.isBorrowed()){
                System.out.println("该书已经被借出！");
            }else{
                bookList.getBook(i).setBorrowed(true);
                System.out.println("借书成功！");
            }
        }
    }

}
