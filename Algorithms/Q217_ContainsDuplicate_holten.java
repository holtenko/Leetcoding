/**
* Created by holten on 2016-07-20.
* Email: holten.ko@gmail.com
*/

public class Q217_ContainsDuplicate_holten {
    public boolean containsDuplicate(int[] nums) {
        int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int tmp:nums){
			if(tmp<min) min=tmp;
			if(tmp>max) max=tmp;
		}
		boolean[] boolMap=new boolean[max-min+1];
		for(int tmp:nums){
			if(boolMap[tmp-min]) {
				return true;
			}else{
				boolMap[tmp-min]=true;
			}
		}
		return false;
    }
}