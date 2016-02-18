package medium;

public class SingleNumberII_137 {
	public static int singleNumber(int[] nums) {
		int digits[]=new int[32];
		int num=0;
		for(int i=0;i<32;i++){
			for(int j=0;j<nums.length;j++){
				digits[i]+=(nums[j]>>i)&1;
			}
			digits[i]=digits[i]%3;
			num|=digits[i]<<i;
		}
	    return num;
    }
	public static void main(String argv[]){
		System.out.println(singleNumber(new int[]{1,1,1,2,2,2,3,3,3,6}));
	}
}
