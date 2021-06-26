package study0624;

import java.util.Arrays;

public class SortRelearn {
    public static int[] insertSort(int[] arr){
        int bound = 1;
        for(; bound < arr.length; bound++){
            int v = arr[bound];
            int cur = bound - 1;
            for(; cur >= 0; cur--){
                if(arr[cur] > v){
                    arr[cur + 1] = arr[cur];
                }else{
                    break;
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
            gap /= 2;
        }
        return arr;
    }
    public static void _shellSort(int[] arr, int gap){
        int bound = gap;
        for(; bound < arr.length; bound++){
            int v = arr[bound];
            int cur = bound - gap;
            for(; cur >= 0; cur-= gap){
                if(arr[cur] > v){
                    arr[cur + gap] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur + gap] = v;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 5, 8, 3, 7, 2};
        int[] out = insertSort(arr);
//        int[] out = shellSort(arr);
        System.out.println(Arrays.toString(out));
    }
}
