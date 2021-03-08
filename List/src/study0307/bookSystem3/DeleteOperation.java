package study0307.bookSystem3;

import java.util.Scanner;

public class DeleteOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        Scanner sc = new Scanner(System.in);
        System.out.println("删除书籍！");

        System.out.println("请输入要删除书籍的名字：");
         String name = sc.next();
         int i = 0;
         for (; i < bookList.getSize(); i++){
             if (name.equals(bookList.getBook(i).getName())){
                 break;
             }
             if (i > bookList.getSize()){
                 System.out.println("您输入的书籍在系统中没有找到！");
                 return;
             }
             if(i != bookList.getSize() - 1){
                 bookList.setBook(i, bookList.getBook(bookList.getSize() - 1));
                 return;
             }else{
                 bookList.setSize(bookList.getSize() - 1);
                 System.out.println("删除成功！");
             }

         }
    }


}
