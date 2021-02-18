package Study0218;


class Animal {
   private String name;
   public void eat(String name ){//定义eat方法
       System.out.println(name + "正在吃");
   }
   public void sleep(String name){//定义sleep方法
       System.out.println(name + "正在睡");
   }

    public void setName(String name) {//set方法，设置name的值
        this.name = name;
    }
    public String getName(){//get方法，得到name的值
       return name;
    }
}
class Bird extends Animal {//Bird类继承自animal
    public void fly(String name){
        System.out.println(name + "正在飞");
    }
}
class Dog extends Animal {//Dog类继承自animal
    public void bite(String name){
        System.out.println(name + "正在咬人");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Animal animal = new Animal();//实例化animal对象
        animal.setName("一头大象");
        animal.sleep(animal.getName());//调用sleep方法
        Bird bird = new Bird();//实例化bird对象
        bird.setName("八哥");//调用set方法设置name的值
        bird.eat(bird.getName());//调用eat方法，eat方法是public成员，可以被所有类访问。
        Dog dog = new Dog();
        dog.setName("大黄");//调用set方法设置name的值
        dog. bite(dog.getName());//调用sleep方法，sleep方法是public成员，可以被所有类访问。
    }

}