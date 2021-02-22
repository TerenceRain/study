package Study0221;
abstract class Pet{
    protected String name;
    public Pet(String name){
        this.name = name;
    }
    abstract public void shout();
}
class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void shout(){
        System.out.println(name + "正在汪汪叫！");
    }
}

class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void shout(){
        System.out.println(name +"正在喵喵叫！");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Pet pet1 = new Dog("大黄");
        Pet pet2 = new Cat("咪咪");
        pet1.shout();
        pet2.shout();

    }

}
