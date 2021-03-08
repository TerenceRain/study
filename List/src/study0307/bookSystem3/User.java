package study0307.bookSystem3;

abstract public class User {
    protected String name;
    protected IOperation[] operations;
    public abstract int menu();

    public void doOperation(int choice, BookList bookList1){
        IOperation operation = this.operations[choice - 1];
        operation.work(bookList1);
    }
}
