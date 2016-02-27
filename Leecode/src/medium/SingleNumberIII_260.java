package medium;


public class SingleNumberIII_260 {
	public int[] singleNumber(int[] nums) {
        int results[]=new int[2];
        int xor=0;
        for(int i=0;i<nums.length;i++){
        	xor^=nums[i];
        }
        xor = Integer.highestOneBit(xor);

        for(int num: nums){
            if((xor & num) == 0){
                results[0] ^= num;
            }
            else{
                results[1] ^= num;
            }
        }
        return results;
    }
}
