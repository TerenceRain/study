package Study0208;

public class Cat {
    String name;
    int age;
    String sex;
    String color;
    public Cat(String name, int age, String sex, String color){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.color = color;
        
    }

    public static void main(String[] args) {
        Cat cat = new Cat("花花" , 2, "母猫" , "黄色");
        cat.display();
    }

    private  void display() {
        System.out.println("名字：" + name + "  年龄：" + age + "  性别：" + sex + "  花色：" + color);
    }
}
