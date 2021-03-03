package Study0302;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(subset(new int[]{2,5}));
    }

    private static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for(int i = 0; i < nums.length ; i++)
        {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                List<Integer> newtemp = new ArrayList<Integer>(res.get(j));
                newtemp.add(nums[i]);
                res.add(newtemp);
            }
        }
        return res;

    }

}
