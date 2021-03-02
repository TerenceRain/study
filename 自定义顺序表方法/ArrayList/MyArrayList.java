package Study0302.ArrayList;

import javax.imageio.spi.ImageInputStreamSpi;

class MyArrayListIndexOutOfRangeException extends RuntimeException{
    public MyArrayListIndexOutOfRangeException(String massage){
        super(massage);
    }
}

public class MyArrayList {
    protected String[] data = null;
    protected int size = 0;
    int capacity = 2;

    public MyArrayList() {
        data = new String[capacity];
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i < size - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }


    public void add(String elem) {
        if (size >= capacity) {
            realloc();
        }
        data[size] = elem;
        size++;
    }

    //往中间插入元素，把指定位置之后的元素依次往后挪一位，腾出一个空位
    public void add(int index, String elem) {
        if (index < 0 || index > size) {
            return;
        }
        if (size >= capacity) {
            realloc();
        }
        for (int i = size - 1; i > index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = elem;
        size++;
    }


    private void realloc() {
        capacity = 2 * capacity;
        String[] newData = new String[capacity];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public String remove(int index){
        if (index < 0 || index > size){
//            return null;
            throw new MyArrayListIndexOutOfRangeException("下边越界了！" + index);
        }
        String result = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return result;
    }

    public boolean remove(String elem){
        int index = 0;
        for (; index < size; index++) {
            if(data[index].equals(elem)){
                break;
            }
        }
        if (index >= size){
            throw new MyArrayListIndexOutOfRangeException("下标越界了！" + index);
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return true;

    }

    public String get(int index){
        if (index >= size){
            throw new MyArrayListIndexOutOfRangeException("下标越界了！" + index);
        }
        return data[index];
    }
    public void set(int index, String elem){
        if (index >= size){
            throw new MyArrayListIndexOutOfRangeException("下标越界了！" + index);
        }
        data[index] = elem;
    }

    public boolean contains(String elem){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(elem)){
                return true;
            }
        }
        return false;
    }

    public int indexOf(String elem){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(elem)){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(String elem){
        for (int i = size - 1; i >= 0; i--) {
            if (data[i].equals(elem)){
                return i;
            }
        }
        return -1;
    }

    public void clear(){
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }


}
