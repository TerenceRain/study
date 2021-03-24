package study0323;

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


    public static void main(String[] args) {
        int[] arr = {6,4,9,8,3};
//        System.out.println(Arrays.toString(insertSort(arr)));
//        System.out.println(Arrays.toString(shellSort(arr)));
        selectSort(arr);
    }
}
