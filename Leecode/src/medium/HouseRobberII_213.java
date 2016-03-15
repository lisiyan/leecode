package medium;

public class HouseRobberII_213 {
	public int rob(int[] nums) {
		//d[i]=max(d[i-1],d[i-2]+nums[i])
		int len=nums.length;
        if(len==0)
            return 0;
        if(len==1)
            return nums[0];
        if(len==2)
            return Math.max(nums[0], nums[1]);
        int value[]=new int[len];
        value[0]=nums[0];
        value[1]=Math.max(nums[0], nums[1]);
        for(int i=2;i<len-1;i++){
        	value[i]=Math.max(value[i-1], value[i-2]+nums[i]);
        }
        int max1=value[len-2];
        
        value[1]=nums[1];
        value[2]=Math.max(nums[1], nums[2]);
        for(int i=3;i<len;i++){
        	value[i]=Math.max(value[i-1], value[i-2]+nums[i]);
        }
        int max2=value[len-1];
        return Math.max(max1, max2);
    }
}
