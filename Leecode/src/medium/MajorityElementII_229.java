package medium;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII_229 {
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> result=new ArrayList<Integer>();
        int len=nums.length;
        if(len==0)
        	return result;
        if(len==1){
        	result.add(nums[0]);
        	return result;
        }
        if(len==2){
        	result.add(nums[0]);
        	if(nums[0]!=nums[1])
        		result.add(nums[1]);
        	return result;
        }
        Integer nums1=nums[0];
        int count1=1;
        Integer nums2=null;
        int count2=0;
        for(int i=1;i<len;i++){
            if(count1==0&&nums[i]!=nums2){
                count1++;
                nums1=nums[i];
                continue;
            }
            else if(count2==0&&nums[i]!=nums1){
                count2++;
                nums2=nums[i];
                continue;
            }
        	if(nums[i]!=nums1&&nums2==null){
        		nums2=nums[i];
        		count2++;
        	}
        	else if(nums[i]==nums1){
        		count1++;
        	}
        	else if(nums[i]==nums2){
        		count2++;
        	}
        	else{
        		count1--;
        		count2--;
        	}
        }
        //System.out.println(count1+" "+count2+" "+(int)len/3+" "+nums1+" "+nums2);
        count1 = 0; 
        count2 = 0;
        for(int num : nums){
            if(num == nums1) 
            	count1+=1;
            if(nums2!=null&&num == nums2) 
            	count2+=1;
        }
        if(count1>len/3)
        	result.add(nums1);
        if(count2>len/3)
        	result.add(nums2);
        return result;
    }
}
