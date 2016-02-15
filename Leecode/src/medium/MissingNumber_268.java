package medium;

public class MissingNumber_268 {
	public static int missingNumber(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
        	count=count^i^nums[i];
        }
        count=count^(nums.length);
        return count;
    }
	public static void main(String argv[]){
		System.out.println(missingNumber(new int[]{9,8,7,0,1,2,4,5,6}));
	}
}
