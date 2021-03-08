package study0307.bookSystem3;


public class BookList {
    private Book[] books = new Book[100];
    private int size = 0;
    public BookList(){
        books[0] = new Book("道德经", "老子", 20, "经文");
        books[1] = new Book("南华经", "庄子", 20, "经文");
        books[2] = new Book("冲虚经", "列子", 20, "经文");
        size = 3;
    }

    public Book getBook(int index){
        return books[index];
    }
    public void setBook(int index, Book book){
        books[index] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
