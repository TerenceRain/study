package Study0220;



class School {
    public String name;
    public School(String name){
        this.name = name;
    }
    public void printOut(String name){
        System.out.println("这是学校");
        System.out.println(this.name + "的别名是" + name);
    }
}

class Teacher extends School{
    public Teacher(String name){
        super(name);
    }
    public void printOut(String name){
        System.out.println("这是老师");
        System.out.println(this.name + "的小名是" + name);
    }
}
public class Demo3 {
    public static void main(String[] args) {
        School school1 = new School("红星小学");
        School school2 = new Teacher("张老师");
        school1.printOut("红小");
        school2.printOut("花花");
    }
}
