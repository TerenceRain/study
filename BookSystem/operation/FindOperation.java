package BookSystem.operation;

import BookSystem.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("查找书籍");
        System.out.println("请输入要查找的书名：");
        String name = scanner.next();
        for (int i = 0; i < bookList.getSize(); i++ ){
           if (bookList.getBook(i).getName().contains(name)){
               System.out.println(bookList.getBook(i));
              return;

           }else{
               System.out.println("没有您要找的书籍！");
               break;
           }
        }
    }

}
