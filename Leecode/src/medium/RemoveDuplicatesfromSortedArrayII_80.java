package medium;

public class RemoveDuplicatesfromSortedArrayII_80 {
	public int removeDuplicates(int[] nums) {
		int len=nums.length;
        if(len==0)
        	return 0;
        int currentVal=nums[0];
        int index=1;
        int times=1;
        for(int i=1;i<len;i++){
        	if(nums[i]==currentVal){
        		times++;
        		if(times<=2)
        			index++;
        	}
        	if(nums[i]!=currentVal){
        		nums[index]=nums[i];
        		currentVal=nums[i];
        		index++;
        		times=1;
        	}
        }
        return index;
    }
}
