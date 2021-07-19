package study0624;

import javax.xml.crypto.Data;
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
           arr[cur + 1]  =v;
       }
       return arr;
   }

    public static int[] shellSort(int[] arr) {
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
                   swap(arr, cur, bound);
               }
           }

       }
       return arr;
 }

public static int[] bubbleSort(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        for(int j = i; j > 0; j--){
            if(arr[j] < arr[j - 1]){
                swap(arr, j, j - 1);
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

public static int[] quickSort(int[] arr){
       _quickSort(arr, 0, arr.length - 1);
       return arr;
}
public static void _quickSort(int[] arr, int left, int right){
       if(left >= right){
           return;
       }
       int index = partition(arr, left, right);
       _quickSort(arr, left, index - 1);
       _quickSort(arr, index + 1, right);
}
public static int partition(int[] arr, int left, int right){
       int i = left;
       int j = right;
       int indexElement = arr[left];
       while(i < j){
           while(i < j && arr[j] >= indexElement){
               j--;
           }
           while(i < j && arr[i] <= indexElement){
               i++;
           }
           swap(arr, i, j);
       }
       swap(arr, i, left);
       return i;
}
    public static int[] mergeSort(int[] arr){
       _mergeSort(arr, 0, arr.length);
       return arr;
    }
   public static void _mergeSort(int[] arr, int left, int right){
       if (right - left <= 1){
           return;
       }
       int mid = (left + right) / 2;
       _mergeSort(arr, left, mid);
       _mergeSort(arr, mid, right);
       merge(arr, left, mid, right);
   }
   public static void merge(int[] arr, int left, int mid, int right){

       int cur1 = left;
       int cur2 = mid;
       int[] temp = new int[right - left];
       int tempIndex = 0;
       while(cur1 < mid && cur2 < right){
           if(arr[cur1] <= arr[cur2]){
               temp[tempIndex++] = arr[cur1++];
           }else{
               temp[tempIndex++] = arr[cur2++];
           }
       }
       while(cur1 < mid){
           temp[tempIndex++] = arr[cur1++];
       }
       while(cur2 < right){
           temp[tempIndex++] = arr[cur2++];
       }
       for (int i = 0; i < temp.length; i++) {
           arr[left + i] = temp[i];

       }
   }
     public static void main(String[] args) {
       
        int[] arr = {9, 5, 8, 3, 7, 2};
//        int[] out = insertSort(arr);
//        int[] out = shellSort(arr);
//        int[] out = selectSort(arr);
//        int[] out = bubbleSort(arr);
        int[] out = quickSort(arr);
//        int[] out = mergeSort(arr);
        System.out.println(Arrays.toString(out));
    }

}
