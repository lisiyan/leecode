package medium;

public class SearchInsertPosition_35 {
	public int searchInsert(int[] nums, int target) {
       /* int len=nums.length;
        for(int i=0;i<len;i++){
        	if(nums[i]==target){
        		return i;
        	}
        	else if(nums[i]>target){
        		return i;
        	}
        }
        return len;*/
		int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}
