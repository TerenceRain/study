package Study0220;
class Animal2{
    public Animal2(){
        System.out.println("Animal2的构造方法被使用了！");
    }

}

class Dog2 extends Animal2{
   public Dog2(){
       System.out.println("Dog2的构造方法被使用了！");
   }
}
public class Demo2 {
    public static void main(String[] args) {
      Animal2 animal2 =  use();
    }

    private static Animal2  use() {
        Dog2 dog2 = new Dog2();
        return dog2;
    }
}
