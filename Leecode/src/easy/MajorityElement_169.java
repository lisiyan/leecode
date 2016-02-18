package easy;

import java.util.HashMap;

public class MajorityElement_169 {
	public static int majorityElement(int[] nums) {
        int major=0;
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
        	Integer times=map.get(nums[i]);
        	if(times==null){
        		map.put(nums[i], 1);
        		if(1>nums.length/2){
        			return nums[i];
        		}
        	}
        	else{
        		times++;
        		if(times>nums.length/2){
        			return nums[i];
        		}
        		map.put(nums[i], times);
        	}
        }
        return major;
    }
	public static void main(String argv[]){
		System.out.println(majorityElement(new int[]{1}));
	}
}
