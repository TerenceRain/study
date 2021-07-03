package study0624;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortRelearn {
    public static int[] insertSort(int[] arr){
        int bound = 1;
        for(; bound < arr.length; bound++){
            int v = arr[bound];
            int cur = bound - 1;
            for(; cur >= 0; cur--){
                if(arr[cur] > v){
                    arr[cur + 1] = arr[cur];
                }
            }
            arr[cur + 1] = v;
        }
        return arr;

    }

    public static int[] shellSort(int[] arr){
        int gap = arr.length / 2;
        while(gap >= 1){
            _shellSort(arr, gap);
            gap = gap / 2;
        }
        return arr;
    }

    public static void _shellSort(int[] arr, int gap){
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

 public static int[] selectSort(int[] arr){
        int bound = 0;
        for(; bound < arr.length; bound++){
            int cur = bound + 1;
            for(; cur < arr.length; cur++){
                if(arr[cur] < arr[bound]){
                    swap(arr, bound, cur);
                }
            }
        }
        return arr;
 }

 public static int[] bubbleSort(int[] arr){
     for (int i = 0; i < arr.length; i++) {
         for (int j = arr.length - 1; j > i ; j--) {
             if(arr[j - 1] > arr[j]){
                 swap(arr, j - 1, j);
             }

         }

     }
     return arr;
 }
 public static void swap(int[] arr, int i, int j){
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
 }

    public static void main(String[] args) {
       
        int[] arr = {9, 5, 8, 3, 7, 2};
//        int[] out = insertSort(arr);
        int[] out = shellSort(arr);
//        int[] out = selectSort(arr);
//        int[] out = bubbleSort(arr);
        System.out.println(Arrays.toString(out));
    }

}
