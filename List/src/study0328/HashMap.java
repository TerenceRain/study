package study0328;

import com.sun.org.apache.regexp.internal.RE;
import study0307.bookSystem3.Book;

class HashNode{
    public int key;
    public int value;
    HashNode next;

    public HashNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
public class HashMap {
    private HashNode[] array = new HashNode[16];
    private int size = 0;
    private int hashCode(int key){//把key映射成数组下标，方法是简单求余
        return key % array.length;
    }

    public void put(int key, int value){
        //根据key计算出下标位置
        int index = hashCode(key);
        //看key在hash表中是否存在，不存在就直接插入新节点
        for (HashNode cur = array[index]; cur != null; cur = cur.next){
            if (cur.key == key){
                cur.value = value;
                return;
            }
        }
        //经过上面的循环，没有找到相应的key，就说明该key不存在，
        //需要创建新的节点插入到链表上。（头插）
        HashNode newNode = new HashNode(key, value);
        newNode.next = array[index];
        array[index] = newNode;
        size++;
        if (loadFactor() > 0.75){
            resize();
        }
    }

    private void resize() {
        HashNode[] newArray = new HashNode[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            HashNode next = null;
            for (HashNode cur = array[i]; cur != null; cur = cur.next){
                next = cur.next;
                int newIndex = cur.key % newArray.length;
                cur.next = newArray[newIndex];
                newArray[newIndex] = cur;
            }
        }
        array = newArray;
    }

    private double loadFactor() {
        return (double)size / array.length;
    }

    public Integer get(int key){
        int index = hashCode(key);
        for (HashNode cur = array[index]; cur != null; cur = cur.next){
            if (cur.key == key){
                return cur.value;
            }
        }
        return null;
    }

    public Boolean remove(int key){
        int index = hashCode(key);

       for ( HashNode cur = array[index]; cur != null; cur = cur.next){
           HashNode parent = null;
            if (cur.key == key) {
                parent = cur;
                parent.next = cur.next;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(01, 1);
        System.out.println(hashMap.remove(01));
        int result = hashMap.get(01);
        System.out.println(result);

    }
}
