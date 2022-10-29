import java.util.HashMap;

/**
* Created by holten on 2016-07-04.
* Email: holten.ko@gmail.com
*/

public class Q349_IntersectionofTwoArrays_holten {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> num1Hashmap=new HashMap<>();
		HashMap<Integer,Integer> resultHashmap=new HashMap<>();

		for(int i=0;i< nums1.length;i++){
			if(!num1Hashmap.containsKey(nums1[i])) num1Hashmap.put(nums1[i],i);
		}
		for(int i=0;i< nums2.length;i++){
			if(num1Hashmap.containsKey(nums2[i])&&!resultHashmap.containsKey(nums2[i])) resultHashmap.put(nums2[i],i);
		}
		int[] result=new int[resultHashmap.size()];
		int index=0;
		for (Integer num:resultHashmap.keySet()) {
			result[index++]=num;
		}
		return result;
    }
}