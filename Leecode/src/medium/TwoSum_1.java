package medium;

import java.util.HashMap;

public class TwoSum_1 {
	public int[] twoSum(int[] nums, int target) {
		int[] results=new int[2];
        int len=nums.length;
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<len;i++){
        	map.put(nums[i], i);
        }
        for(int i=0;i<len;i++){
        	Integer index=map.get(target-nums[i]);
        	//System.out.println(nums[i]+" "+index);
        	if(index!=null&&index!=i){
        		results[0]=i;
        		results[1]=index;
        		break;
        	}
        }
        return results;
    }
}
