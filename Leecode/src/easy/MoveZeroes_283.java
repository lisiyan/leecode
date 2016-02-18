package easy;

public class MoveZeroes_283 {
	public static void moveZeroes(int[] nums) {    
	    int insertPos = 0;
	    for (int num: nums) {
	        if (num != 0){
	        	nums[insertPos] = num;
	        	insertPos++;
	        }
	    }        

	    while (insertPos < nums.length) {
	        nums[insertPos] = 0;
	        insertPos++;
	    }
        for(int i=0;i<nums.length;i++)
        	System.out.print(nums[i]+" ");
    }
	public static void main(String argv[]){
		moveZeroes(new int[]{0, 1, 0, 3, 12});
	}
}
