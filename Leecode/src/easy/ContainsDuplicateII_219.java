package easy;

import java.util.HashSet;

public class ContainsDuplicateII_219 {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
       int len=nums.length;
       if(k>=len-1)
    	   k=len;
       if(k==0)
    	   return false;
       HashSet<Integer> set = new HashSet<Integer>();
       for(int i=0;i<len;i++){
           if(!set.add(nums[i])){
               return true;
           }
           if(i>=k){
        	   set.remove(nums[i-k]);
           }
       }
       return false;
    }
	public static void main(String argv[]){
		System.out.println(containsNearbyDuplicate(new int[]{-1,-1},1));
	}
}
