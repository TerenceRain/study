package Study0220;
class Animal{
    public void eat(String name){
        System.out.println(name + "正在进食！");
    }
}

class Dog extends Animal{
    public void bite(String name){
        System.out.println(name + "正在咬人！");
    }
}
public class Demo1 {
    public static void main(String[] args) {
       Dog dog = new Dog();
        use(dog);
    }

    private static void use(Animal animal) {
       animal.eat("大黄");
    }
}
