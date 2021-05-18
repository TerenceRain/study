package study0514;

import java.util.Arrays;

public class Sort {
    public static void insertSort(int[] arr){
//        这是已排序和待排序区间的分界线
       int bound = 1;
       for(; bound < arr.length; bound++){
           int v = arr[bound];
           int cur = bound - 1;
           for(; cur >= 0; cur--){
               if (arr[cur] > v){
                   arr[cur + 1] = arr[cur];
               }else{
                   break;
               }
           }
           arr[cur + 1] = v;
       }
    }

    public static void shellSort(int[] arr){
        int gap = arr.length / 2;
        while(gap >= 1){
            _shellSort(arr, gap);
            gap /= 2;
        }
    }

    public static void _shellSort(int[] arr, int gap) {
        int bound = gap;
        for(; bound < arr.length; bound++){
            int v = arr[bound];
            int cur = bound - gap;
            for(; cur >= 0; cur -= gap){
                if(arr[cur] > v){
                    arr[cur + gap] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur + gap] = v;
        }
    }


    public static void selectSort(int[] arr){
        int bound = 0;
        for(; bound < arr.length; bound++){
            for(int cur = bound + 1; cur < arr.length; cur++){
                if(arr[cur] < arr[bound]){
                    swap(cur, bound, arr);
                }
            }
        }
    }

    public static void heapSort(int[] arr){
        creatHeap(arr);
        int heapSize = arr.length;
        for (int i = 0; i < arr.length; i++) {
            swap(0, heapSize - 1, arr);
            heapSize--;
            shiftDown(arr, heapSize, 0);
        }
    }
    public static void creatHeap(int[] arr){
        for (int i = 0; i < (arr.length - 1 - 1) / 2; i++) {
            shiftDown(arr, arr.length, i);
        }
    }
    public static void shiftDown(int[] arr, int heapSize, int index){
        int parent = index;
        int child = 2 * parent + 1;
        while(child < heapSize){
            if(child + 1 < heapSize && arr[child + 1] > arr[child]) {
                child = child + 1;
            }
            if (arr[parent] < arr[child]) {
                swap(parent, child, arr);
            }else{
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }


    public static void bubbleSort(int[] arr){
        for(int bound = 0; bound < arr.length; bound++){
            for(int cur = arr.length -1 ; cur > 0; cur--){
                if(arr[cur - 1] > arr[cur]){
                    swap(cur, cur - 1, arr);
                }
            }
        }
    }

    public static void swap(int cur, int bound, int[] arr){
        int temp = arr[cur];
        arr[cur] = arr[bound];
        arr[bound] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,9,3,6,8,1,0};
//        selectSort(arr);
//        heapSort(arr);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
//
}
