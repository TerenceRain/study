package BookSystem.operation;


import BookSystem.BookList;

import java.util.Scanner;

//删除一本书
public class DelOperation implements IOperation{
   @Override

    public void work(BookList bookList){
       Scanner scanner = new Scanner(System.in);
       System.out.println("删除书籍");
       System.out.println("请输入要删除的书籍的名字：");
       String name = scanner.next();
       int i = 0;
       for (; i < bookList.getSize() ; i++){
           if(name.equals(bookList.getBook(i).getName())){
               break;
           }
       }
       if(i >= bookList.getSize()){
           System.out.println("您输入的书籍【" + name + "】在系统中没有找到");
            return;
       }
       if (i != bookList.getSize() - 1) {
//如果不是最后的书籍，就把最后的书籍赋值到要删的位置，然后把最后的删掉
           bookList.setBook(i, bookList.getBook(bookList.getSize() - 1));
           return;
       }else {
           bookList.setSize(bookList.getSize() - 1);
           System.out.println("删除成功");
       }
   }
}
