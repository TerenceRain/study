package Study0227;

public class Demo2 {
    public static void main(String[] args) {
        merge(3,2, new int[]{1, 2, 3}, new int[]{2,3 ,4 });

    }

    private static void merge(int m, int n, int[] nums1, int[] nums2) {
        int p = m-- + n-- - 1;
        while (m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }

        while (n >= 0) {
            nums1[p--] = nums2[n--];
        }
    }
}