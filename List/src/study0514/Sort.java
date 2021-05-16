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
    public static void swap(int cur, int bound, int[] arr){
        int temp = arr[cur];
        arr[cur] = arr[bound];
        arr[bound] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,9,3,6,8,1,0};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
//s
}
