package hard;

import java.util.HashMap;

public class LongestConsecutiveSequence_128 {
	public int longestConsecutive(int[] nums) {
		int result=0;
		int len=nums.length;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<len;i++){
			Integer temp=map.get(nums[i]);
			if(temp==null){
				Integer left=map.containsKey(nums[i]-1)?map.get(nums[i]-1):0;
				Integer right=map.containsKey(nums[i]+1)?map.get(nums[i]+1):0;
				int val=left+right+1;
				map.put(nums[i], val);
				if(result<val)
					result=val;
				map.put(nums[i]-left, val);
				map.put(nums[i]+right, val);
			}
		}
		return result;
    }
}
