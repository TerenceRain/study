package Study0218;
class Base{
    public int a = 10;
}
class Derived extends Base{
    public int a = 5;
    public void printOut(){
        System.out.println("访问子类的a：" + a);
        System.out.println("通过super访问父类的a：" + super.a);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.printOut();
    }
}
