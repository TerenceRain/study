package study0308;



public class MyStack {
    private int capacity = 2;
  private int[] data = new int[capacity];
  int size = 0;

  public void push(int val){
      if (size >= data.length){
          realloc();
      }
      data[size] = val;
      size++;
  }
    private void realloc() {
        capacity = 2 * capacity;
        int[] newData = new int[capacity];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
  public int pop(){
      if (size == 0){
          return -1;
      }
      int index = size - 1;
      size--;
      return data[index];

  }

  public int peek(){
      if (size == 0){
          return -1;
      }
      return data[size - 1];
  }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(8);



        System.out.println(myStack.pop());
        System.out.println(myStack.peek());

    }


}
