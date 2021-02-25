package Study0224;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 2, 3, 5}, 0));
    }

    private static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;

    }

}