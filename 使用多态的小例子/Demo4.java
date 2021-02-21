package Study0220;

class Shape{
    protected double s;
    public  Shape(){

    }
    public void calculate(){

    }
}
class Circle extends Shape{
    private  int r;
    public Circle(int r){
        this.r = r;
    }
    public void calculate(){
        System.out.println("圆的面积是：" + 3.14 * r * r);
    }
}
class Rect extends Shape{
    private int a;
    private int b;
    public Rect(int a , int b){
        this.a = a;
        this.b = b;
    }
    public void calculate(){
        System.out.println("矩形的面积是：" + a * b);
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Shape shape1 = new Circle(3);
        Shape shape2 = new Rect(2 , 5);
        shape1.calculate();
        shape2.calculate();
    }
}
