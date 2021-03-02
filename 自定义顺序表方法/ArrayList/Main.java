package Study0302.ArrayList;

public class Main {
    public static void main(String[] args) {
       MyArrayList myArrayList = new MyArrayList();
       myArrayList.add("0");
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");

        myArrayList.add(1, "5");
        System.out.println(myArrayList.toString());
        System.out.println(        myArrayList.remove(1));
        myArrayList.remove("2");
        System.out.println(myArrayList.toString());
    }
}
