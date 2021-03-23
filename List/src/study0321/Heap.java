package study0321;

public class Heap {
    public static void creatHeap(int[] array){
        for (int i = (array.length - 1 - 1) / 2; i >= 0 ; i--) {
            shiftDown(array,array.length, i);
        }
    }

    private static void shiftDown(int[] arr, int size, int index) {//向下调整
        int parent = index;
        int child = 2 * parent + 1;
        while(child < size){
            if (child + 1 < size && arr[child + 1] > arr[child]) {
                child = child + 1;
            }
            if (arr[parent] < arr[child]){
                int temp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = temp;
            }else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public static void shiftUp(int[] arr, int size, int index){
        int child = index;
        int parent = (child - 1) / 2;
        while(child > 0){
            if (arr[parent] < arr[child]) {
                int temp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = temp;
            }else {
                break;
            }
            child = parent;
            parent = (child - 1) / 2;
        }
    }

    private int[] arr = new int[100];
    private int size = 0;
    public void offer(int val){
        if (size >= arr.length){
            return;
        }
        arr[size] = val;
        size ++;
        shiftDown(arr,size, size - 1);
    }

    public void creatHeap2(int[] arr){
        for (int x : arr){
            offer(x);
        }
    }

    public Integer peek(){
        if (size == 0){
            return null;
        }
        return arr[0];
    }

    public Integer pop(){
        if (size == 0){
            return null;
        }
        int result = arr[0];
        int temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;
        size --;

        shiftDown(arr, size,0);
        return result;
    }

}
