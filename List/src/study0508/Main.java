package study0508;

public class Main {
//    public String str = "6";
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.change(main.str);
//        System.out.println(main.str);
//    }
//    public String change(String str){
//        return str = "10";
//    }
//    public static int x = 100;
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.x++;
//        Main main1 = new Main();
//        main1.x++;
//        main = new Main();
//        main.x++;
//        Main.x--;
//        System.out.println(x);
//
//    }
public class BinInsert {//二进制插入
    public int binInsert(int n, int m, int j, int i) {
        // write code here
        m <<= j;
        return m | n;
    }
}
}
