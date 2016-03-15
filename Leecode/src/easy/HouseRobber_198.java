package easy;

public class HouseRobber_198 {
	public int rob(int[] nums) {
		//d[i]=max(d[i-1],d[i-2]+nums[i])
        int len=nums.length;
        if(len==0)
            return 0;
        if(len==1)
            return nums[0];
        int value[]=new int[len];
        value[0]=nums[0];
        value[1]=Math.max(nums[0], nums[1]);
        for(int i=2;i<len;i++){
        	value[i]=Math.max(value[i-1], value[i-2]+nums[i]);
        }
        return value[len-1];
    }
}
