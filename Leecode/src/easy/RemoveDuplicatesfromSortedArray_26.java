package easy;

public class RemoveDuplicatesfromSortedArray_26 {
	public static int removeDuplicates(int[] nums) {
        int len=nums.length;
        if(len==0)
        	return 0;
        int currentVal=nums[0];
        int index=1;
        for(int i=1;i<len;i++){
        	if(nums[i]!=currentVal){
        		nums[index]=nums[i];
        		currentVal=nums[i];
        		index++;
        	}
        }
        return index;
    }
	public static void main(String argv[]){
		int[] array=new int[]{1,2,2,3,4,5,5,6};
		System.out.println(removeDuplicates(array));
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}
}
