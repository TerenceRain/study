package study0307.bookSystem3;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("显示书籍列表");
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
