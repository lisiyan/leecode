package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_78 {
	public List<List<Integer>> subsets(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		int len=nums.length;
		int count=(int)Math.pow(2, len);
		for(int i=0;i<count;i++){
			List<Integer> temp=new ArrayList<Integer>();
			for(int j=0;j<len;j++){
				if((i&(1<<j))!=0){
					temp.add(nums[j]);
				}
			}
			list.add(temp);
		}
		return list;
    }
}
