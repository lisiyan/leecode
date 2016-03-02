package medium;

public class FindPeakElement_162 {
	public static int findPeakElement(int[] nums) {
		int bound=nums.length-1;
		if(bound==0)
			return 0;
		if(bound==1&nums[0]<nums[1])
			return 1;
		else if(bound==1&nums[0]>nums[1])
		    return 0;
        for(int i=1;i<bound;i+=2){
        	if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
        		return i;
        	}
        }
        if(nums[bound]>nums[bound-1]){
        	return bound;
        }
        else{
        	return 0;
        }
    }
	/*
	public int findPeakElement(int[] num) {    
    return helper(num,0,num.length-1);
}

public int helper(int[] num,int start,int end){
    if(start == end){
        return start;
    }else if(start+1 == end){
        if(num[start] > num[end]) return start;
        return end;
    }else{

        int m = (start+end)/2;

        if(num[m] > num[m-1] && num[m] > num[m+1]){

            return m;

        }else if(num[m-1] > num[m] && num[m] > num[m+1]){

            return helper(num,start,m-1);

        }else{

            return helper(num,m+1,end);

        }

    }
}
	 */
	public static void main(String argv[]){
		System.out.println(findPeakElement(new int[]{1,2,1}));
	}
}
