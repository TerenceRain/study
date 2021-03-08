package study0307.bookSystem3;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("删除书籍");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int i = 0;
        for(; i < bookList.getSize(); i++){
            if (bookList.getBook(i).getName().equals(name)){
                break;
            }
        }
        if (i >= bookList.getSize()){
            System.out.println("找不到该书籍， 无法完成删除操作！");

        }
        if (i != bookList.getSize() - 1){
            bookList.setBook(i, bookList.getBook(bookList.getSize() - 1));
            System.out.println("删除成功！");

            return;
        }else {
            bookList.setSize(bookList.getSize() - 1);
            System.out.println("删除成功！");
        }
    }
}
