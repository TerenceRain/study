package study0307.bookSystem3;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("退出程序!");
        System.exit(0);
    }
}
