package Study0301;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 1,2,3,4}));
    }

    private static boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i -1]){
                return true;
            }
        }
        return false;
    }
}
