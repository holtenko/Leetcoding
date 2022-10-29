import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q368_LargestDivisibleSubset {
    public static void main(String[] args) {
        int[] nums = {3,17};
        System.out.println(largestDivisibleSubset(nums));
    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
        ArrayList<Integer> dp1 = new ArrayList<>();
        dp1.add(nums[0]);
        dp.add(dp1);
        int largestIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int curLargestIndex = -1;
            for (int j = 0; j < dp.size(); j++) {
                ArrayList<Integer> dpj = dp.get(j);
                Integer dpjMax = dpj.get(dpj.size() - 1);

                if (cur % dpjMax == 0) {
                    if (curLargestIndex > -1) {
                        if (dpj.size() > dp.get(curLargestIndex).size()) {
                            curLargestIndex = j;
                        }
                    } else {
                        curLargestIndex = j;
                    }
                }
            }
            ArrayList<Integer> dpi;
            if (curLargestIndex > -1) {
                dpi = new ArrayList<>(dp.get(curLargestIndex));
            } else {
                dpi = new ArrayList<>();
            }
            dpi.add(cur);
            dp.add(dpi);
            if (dpi.size() > dp.get(largestIndex).size()) {
                largestIndex = i;
            }
        }
        return dp.get(largestIndex);
    }
}