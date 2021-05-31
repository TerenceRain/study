package lesson1;

public class JavaProcess {
    public static void main(String[] args) {
        A a = new A(){
//            匿名内部类，本质是A的子类
            @Override
            public void pro(){
                System.out.println("abc");

            }
        };
        a.pro();
    }
//    静态内部类
    static class A{
        public void pro(){
            System.out.println("a pro");
        };
    }

    interface B{
        void pro();
    }
}
