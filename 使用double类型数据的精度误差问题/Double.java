package Study0208;

public class Double {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1.1;
        if (a * b == 1.21){
            System.out.println("相等");
        }else{
            System.out.println("不相等");//由于Java中double类型的数据有精度误差，所以不能直接比较判断
        }

//           正确的处理办法如下
        System.out.println(a * b);
        if (a * b - 1.21 < 0.0001 && a * b - 1.21 > -0.0001 ){//提供一个精度误差范围，如果误差在这个范围内，
            // 就认为相等

            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
    }
}
