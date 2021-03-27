package study0323;

import com.sun.corba.se.impl.presentation.rmi.StubInvocationHandlerImpl;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Sort {
    public static int[] insertSort(int[] arr){//插入排序
        int bound = 1;
        for(; bound < arr.length; bound ++){//外层循环，处理比较的趟数
            int v = arr[bound];
            int cur = bound - 1;
            for (; cur >= 0; cur--){//内层循环，处理，每趟取出的元素和已排序区间中的每个元素作比较
                if (arr[cur] > v) {//如果取出的元素小于每次取出的一排序区间中的元素，
                                    // 就让已排序区间中这个元素后移一位
                    arr[cur + 1] = arr[cur];
                } else{//否则，结束比较
                    break;
                }
            }
            arr[cur + 1] = v;//比较完成后，把取出的这个元素插入数组中
        }
            return arr;
    }


    public static int[] shellSort(int[] arr){//希尔排序
        int gap = arr.length / 2;
        while(gap >= 1){
            _shellSort(arr, gap);
            gap = gap / 2;
        }
            return arr;
    }

    private static void _shellSort(int[] arr, int gap) {
        int bound = gap;
        for(; bound < arr.length; bound ++){
            int v = arr[bound];
            int cur = bound - gap;
            for (; cur >= 0; cur -= gap){
                if (arr[cur] > v){
                    arr[cur + gap] = arr[cur];
                }else {
                    break;
                }
            }
            arr[cur + gap] = v;
        }
    }
    public static void selectSort(int[] arr) {
        int bound = 0;
        for(; bound < arr.length; bound++){//这就是排序的趟数
            int cur = bound + 1;
            for(; cur < arr.length; cur++){//内层循环就是打擂台的过程，遍历无序区间
                if (arr[cur] < arr[bound]) {//如果有元素比擂主小，就和擂主交换位置
                    swap(arr, cur, bound);
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }


    public static void heapSort(int[] arr){
        creatHeap(arr);
        int heapSize = arr.length;
        for (int i = 0; i < arr.length; i ++){
            swap(arr , 0, heapSize - 1);
            heapSize --;
            shiftDown(arr, heapSize, 0);
        }
    }

    private static void creatHeap(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--){
            shiftDown(arr, arr.length, i);
        }
    }

    private static void shiftDown(int[] arr, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while(child < size){
            if (child + 1 < size && arr[child + 1] >arr[child]) {
                child = child + 1;
            }
            if (arr[parent] < arr[child]){
                swap(arr, parent, child);
            }else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }

    }

    public static void bubbleSort(int[] arr){//冒泡排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]){
                    swap(arr, j, i);
                }
            }
        }
    }
   public static void quickSort(int[] arr){//快速排序
        _quickSort(arr, 0, arr.length - 1);

   }

    private static void _quickSort(int[] arr, int left, int right) {
        if (left >= right){
            return;
        }
        int index = partition(arr, left, right);
        _quickSort(arr, left, index - 1);
        _quickSort(arr, index + 1, right);
    }
    private static int partition(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int index  = arr[left];
        while(i < j){
            while(i < j && arr[j] >= index){
                j--;
            }
            while(i < j && arr[i] <= index){
                i++;
            }
            swap(arr, i, j);
        }
        swap(arr, i, left);
        return i;
    }


    public static void mergeSort(int[] arr){
        _mergeSort(arr, 0, arr.length);
    }//归并排序

    private static void _mergeSort(int[] arr, int left, int right) {
        if (right - left <= 1){
            return;
        }
        int mid = (left + right) / 2;
        _mergeSort(arr, left, mid);
        _mergeSort(arr, mid, right);

        merge(arr, left, mid, right);

    }

    private static void merge(int[] arr, int left, int mid, int right) {
        if (left >= right){
            return;
        }
        int[] temp = new  int[right - left];
        int tempIndex = 0;
        int cur1 = left;
        int cur2 = mid;
        while(cur1 < mid && cur2 < right){
            if (arr[cur1] <= arr[cur2]){
                temp[tempIndex] = arr[cur1];
                tempIndex++;
                cur1++;
            }else{
                temp[tempIndex] = arr[cur2];
                tempIndex++;
                cur2++;
            }
        }
        while(cur1 < mid){
            temp[tempIndex] = arr[cur1];
            tempIndex++;
            cur1++;
        }
        while(cur2 < right){
            temp[tempIndex] = arr[cur2];
            tempIndex++;
            cur2++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,5,2,7,3,6,8};
//        System.out.println(Arrays.toString(insertSort(arr)));
//        System.out.println(Arrays.toString(shellSort(arr)));
//        selectSort(arr);
//        heapSort(arr);
//        bubbleSort(arr);
//        quickSort(arr);
//        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
