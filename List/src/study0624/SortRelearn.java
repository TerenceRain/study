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

    public static int[] selectSort(int[] arr) {
        int bound = 0;
        for(; bound < arr.length; bound++){//这就是排序的趟数
            int cur = bound + 1;
            for(; cur < arr.length; cur++){//内层循环就是打擂台的过程，遍历无序区间
                if (arr[cur] < arr[bound]) {//如果有元素比擂主小，就和擂主交换位置
                    swap(arr, cur, bound);
                }
            }
        }
        return arr;

    }
    public static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {9, 5, 8, 3, 7, 2};
//        int[] out = insertSort(arr);
//        int[] out = shellSort(arr);
        int[] out = selectSort(arr);
        System.out.println(Arrays.toString(out));
    }

}
