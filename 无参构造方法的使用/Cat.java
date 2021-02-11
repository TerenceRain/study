package Study0208;

public class Cat {
    String name;
    int age;
    String sex;
    String color;
    public Cat(){
        name = "花花";
        age = 2;
        sex = "母猫";
        color = "黄色";
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.display();
    }

    private  void display() {
        System.out.println("名字：" + name + "  年龄：" + age + "  性别：" + sex + "  花色：" + color);
    }
}
