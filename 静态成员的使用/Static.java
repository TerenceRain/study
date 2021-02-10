package Study0208;

public class Static {
    static int  num1 = 0;//①
    int num2 = 0;
    public void add(){//②
        num1 ++;
        num2 ++;
        System.out.println("num1 = " + num1 + " , num2 = " + num2);//③
    }

    public static void main(String[] args) {
        Static d1 = new Static();//④
        d1.add();
        Static d2 = new Static();
        d2.add();
        Static d3 = new Static();
        d3.add();
        Static d4 = new Static();
        d4.add();

    }
}
