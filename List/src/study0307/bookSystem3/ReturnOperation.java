package study0307.bookSystem3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        Scanner sc = new Scanner(System.in);
        System.out.println("归还书籍");
        String name = sc.next();
        int i = 0;
        for (; i < bookList.getSize(); i ++){
            if (bookList.getBook(i).getName().equals(name)){
                break;
            }
            if (i >= bookList.getSize()){
                System.out.println("找不到该书籍， 无法归还!");
            }else {
                Book cur = bookList.getBook(i);
                if(!cur.isBorrowed()){
                    System.out.println("该书没有被借出，无法归还！");
                }else{
                    cur.setBorrowed(false);
                    System.out.println("归还成功！");
                }
            }
        }
    }
}
