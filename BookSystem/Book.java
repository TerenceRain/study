package BookSystem;
//book类用来表示一本书的信息，通过Book类的属性来表示
public class Book {
    private String name;
    private String author;
    private double price;
    private String type;
    private boolean isBorrowed = false;
    //使用构造方法进行初始化


    public Book(String name, String author, double price, String type)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

   @Override//重写toString方法

    public String toString(){
       return "Book{" +
               "name='" + name + '\'' +
               ",author='" + author + '\'' +
               ",price='" + price  +
               ",type='" + type + '\'' +
               ",isBorrowed=" + isBorrowed +
               '}';
    }

    public String getName(){
        return name;
    }

    public boolean isBorrowed(){
        return isBorrowed;
    }

    public void setBorrowed (boolean borrowed){
        isBorrowed = borrowed;
    }
}

