import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
* Created by holten on 2016-07-20.
* Email: holten.ko@gmail.com
*/

public class Q350_IntersectionofTwoArraysII_holten {
    public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> num1Hashmap = new HashMap<>();
		HashMap<Integer, Integer> resultHashmap = new HashMap<>();
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (!num1Hashmap.containsKey(nums1[i])) {
				count = 0;
			} else {
				count = num1Hashmap.get(nums1[i]);
			}
			num1Hashmap.put(nums1[i], count + 1);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (num1Hashmap.containsKey(nums2[i])) {
				if (!resultHashmap.containsKey(nums2[i])) {
					count = 0;
				} else if (resultHashmap.containsKey(nums2[i])) {
					count = resultHashmap.get(nums2[i]);
				}
				resultHashmap.put(nums2[i], count + 1);
			}
		}

		List<Integer> result = new ArrayList<>();

		for (Integer num : resultHashmap.keySet()) {
			for (int i = 0; i < Math.min(resultHashmap.get(num), num1Hashmap.get(num)); i++) {
				result.add(num);
			}
		}

		Integer[] re = new Integer[result.size()];
		result.toArray(re);

		int[] finalResult = new int[re.length];
		for (int i = 0; i < re.length; i++) {
			finalResult[i] = re[i];
		}
		return finalResult;
	}
}