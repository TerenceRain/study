package study0307.bookSystem3;

public class Book {
    private String name;
    private String author;
    private double price;
    private String type;
    private boolean isBorrowed = false;


    public  Book(String name, String author, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
        this.author = author;

    }

    @Override
    public String toString(){
        return "Book{" + "name = '" + name + "\'" + ",author='" + author +"\'"
        + ",price=" + price + ",type" + type +"\'" + ",isBorrowed=" + isBorrowed +"}";
    }

    public String  getName(){
        return name;
    }
    public boolean isBorrowed(){
        return isBorrowed;
    }
    public void setBorrowed(boolean isBorrowed){
        this.isBorrowed = isBorrowed;
    }
}
