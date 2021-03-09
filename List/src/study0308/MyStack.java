package study0308;

public class MyStack {
  private int[] data = new int[100];
  private int size = 0;

  //入栈

    public void push(int val){
        if(size >= data.length){
            //进行扩容操作

            size = 2 * size;
            int newData[] = new int[size];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
                data = newData;
                return;
            }

            data[size] = val;
            size++;
        }
    }

    //出栈
    public Integer pop(){
        if(size == 0){
            return  null;
        }

        int ret = data[size - 1];
        size--;
        return ret;
    }

    //取栈顶元素

    public Integer peek(){
        if (size == 0){
            return  null;
        }

        return data[size - 1];
    }
}
