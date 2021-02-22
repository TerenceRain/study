package Study0221;
 interface IPet{
    void shout();
}

class Dog2 implements IPet{
     
      private String name;
     public Dog2(String name){
         this.name = name;
     }
     @Override
    public void shout(){
         System.out.println(this.name + "正在汪汪叫！");
     }
}
class Cat2 implements IPet{

    private String name;
    public Cat2(String name){
        this.name = name;
    }
    @Override
    public void shout(){
        System.out.println(this.name + "正在喵喵叫！");
    }
}
public class Demo2 {



     static class Bird implements IPet{
         private String name;
         private Bird(String name){
             this.name = name;
         }
         @Override
         public void shout(){
             System.out.println(this.name + "正在咕咕叫！");
         }

     }
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2("大黄");
        Cat2 cat2 = new Cat2("喵喵");
        Bird bird = new Bird("小鸟");
        dog2.shout();
        cat2.shout();
        bird.shout();
    }
}
